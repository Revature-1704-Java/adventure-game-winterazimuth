package com.revature;

import java.util.*;

public class Player {
    private static Player PLAYER;
    private static ArrayList<Item> inventory = new ArrayList<Item>();

    private Player() {
        super();
    }

    public static Player makePlayer() {
        if (PLAYER == null) {
            PLAYER = new Player();
            System.out.println("//New player created //Player.makePlayer");
        }
        return PLAYER;
    }

    public static void setInventory(ArrayList<Item> newInventory) {
        inventory = newInventory;
    }

    public static ArrayList<Item> getInventory() {
        return inventory;
    }
}