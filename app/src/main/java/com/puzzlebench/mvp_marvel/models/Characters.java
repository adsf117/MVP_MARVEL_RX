package com.puzzlebench.mvp_marvel.models;

/**
 * Created by andresdavid on 21/02/17.
 */

public class Characters {

    private  String name;
    private  String description;
    private  Thumbnail thumbnail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }
}
