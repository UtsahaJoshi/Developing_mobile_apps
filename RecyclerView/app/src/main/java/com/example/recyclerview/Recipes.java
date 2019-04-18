package com.example.recyclerview;

import java.io.Serializable;

public class Recipes implements Serializable {
    String title, description, image_url;

    public Recipes(String title, String description, String image_url) {
        this.title = title;
        this.description = description;

        this.image_url = image_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
