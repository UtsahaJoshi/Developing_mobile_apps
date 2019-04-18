package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.WordViewHolder> {
    //    private final LinkedList<String> myWordsList;
    private final ArrayList<Recipes> recipes;
    private final LayoutInflater mInflater;
    Context context;
    class WordViewHolder extends ViewHolder
            implements View.OnClickListener {
        public final TextView recipe_title;
        public final TextView recipe_description;

        final RecipeListAdapter mAdapter;

        /**
         * Creates a new custom view holder to hold the view to display in
         * the RecyclerView.
         *
         * @param itemView The view in which to display the data.
         * @param adapter  The adapter that manages the the data and views
         *                 for the RecyclerView.
         */
        public WordViewHolder(View itemView, RecipeListAdapter adapter) {
            super(itemView);
            recipe_title = itemView.findViewById(R.id.recipe_title);
            recipe_description = itemView.findViewById(R.id.recipe_description);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();

            // Use that to access the affected item in myWordsList.
            Recipes recipes_ = recipes.get(mPosition);

//            Bundle bundle = new Bundle();
//            bundle.put("count", count.toString());
            Intent i = new Intent(context, RecipeDetailActivity.class);
            i.putExtra("recipe", (Serializable) recipes_);
            context.startActivity(i);

//
//            // Change the word in the myWordsList.
//
//            myWordsList.set(mPosition, "Clicked! " + element);
//            // Notify the adapter, that the data has changed so it can
//            // update the RecyclerView to display the data.
//            mAdapter.notifyDataSetChanged();
        }
    }

    public RecipeListAdapter(Context context, ArrayList<Recipes> recipeList) {
        mInflater = LayoutInflater.from(context);
        this.recipes = recipeList;
        this.context = context;
    }

    /**
     * Called when RecyclerView needs a new ViewHolder of the given type to
     * represent an item.
     * <p>
     * This new ViewHolder should be constructed with a new View that can
     * represent the items of the given type. You can either create a new View
     * manually or inflate it from an XML layout file.
     * <p>
     * The new ViewHolder will be used to display items of the adapter using
     * onBindViewHolder(ViewHolder, int, List). Since it will be reused to
     * display different items in the data set, it is a good idea to cache
     * references to sub views of the View to avoid unnecessary findViewById()
     * calls.
     *
     * @param parent   The ViewGroup into which the new View will be added after
     *                 it is bound to an adapter position.
     * @param viewType The view type of the new View. @return A new ViewHolder
     *                 that holds a View of the given view type.
     */
    @Override
    public RecipeListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        // Inflate an item view.
        View mItemView = mInflater.inflate(
                R.layout.recipes, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     * This method should update the contents of the ViewHolder.itemView to
     * reflect the item at the given position.
     *
     * @param holder   The ViewHolder which should be updated to represent
     *                 the contents of the item at the given position in the
     *                 data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(RecipeListAdapter.WordViewHolder holder,
                                 int position) {
        // Retrieve the data for that position.
//        Log.d("HELLO", recipes.get(position).getTitle());
        String mCurrent = recipes.get(position).getTitle();
        String currentDescription = recipes.get(position).getDescription();
        // Add the data to the view holder.
        holder.recipe_title.setText(mCurrent);
        holder.recipe_description.setText(currentDescription);
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return recipes.size();
    }
}
