package com.revature;

import java.util.*;

public class Room implements Describable {
    private String name = "";
    private String description = "";
    private ArrayList<String> exits = new ArrayList<String>();

    public void setDescription(String text) {
        description = text;
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

    public void setExits(ArrayList<String> newExits) {
        exits = newExits;
    }

    public ArrayList<String> getExits() {
        return exits;
    }
}