package com.example.birds_grid_view;

public class ModelClass {
    private int image;
    private String text;

    public ModelClass(int image,String text){
        this.image=image;
        this.text=text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
