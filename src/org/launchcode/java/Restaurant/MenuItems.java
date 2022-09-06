package org.launchcode.java.Restaurant;

public class MenuItems {
    private String name;
    private String category;
    private String description;
    private double price;
    private boolean isNew;

    public MenuItems(String name, String category, String description, double price, boolean isNew) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }
}


