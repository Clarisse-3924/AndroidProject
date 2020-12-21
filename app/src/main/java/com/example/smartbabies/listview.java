package com.example.smartbabies;

public class listview {
    int image;
    String name,addToCart,price;

    public listview(int image, String name, String addToCart,String price) {
        this.image = image;
        this.name = name;
        this.price = price;
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
    public String getPrice() {
        return price;
    }
}
