package com.revature;

public class ItemFactory {
    public Item getItem(String name, String description) {
        Item newItem = new Item();
        newItem.setName(name);
        newItem.setDescription(description);
        return newItem;
    }
}