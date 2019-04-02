package com.example.joshi.tabexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;
    public PagerAdapter(FragmentManager fm, int NumofTabs) {
        super(fm);
        this.mNumofTabs=NumofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TabFrag1();
            case 1: return new TabFrag2();
            case 2: return new TabFrag3();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}
