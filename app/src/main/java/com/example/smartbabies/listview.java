package com.example.smartbabies;

public class listview {
    int image;
    String name,addToCart;

    public listview(int image, String name, String addToCart) {
        this.image = image;
        this.name = name;
        this.addToCart = addToCart;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getAddToCart() {
        return addToCart;
    }
}
