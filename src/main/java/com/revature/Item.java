package com.revature;

public class Item implements Describable {
    private String description = "";

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public String look() {
        return description;
    }
}