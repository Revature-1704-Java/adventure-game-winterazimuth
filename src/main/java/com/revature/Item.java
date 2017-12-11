package com.revature;

public class Item implements Describable {
    private String name = "";
    private String description = "";

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public String look() {
        return description;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}