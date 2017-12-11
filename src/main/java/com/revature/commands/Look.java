package com.revature.commands;

import com.revature.Game;
import com.revature.Room;
import com.revature.Item;
import java.util.*;

import javax.net.ssl.ExtendedSSLSession;

public class Look extends Command {
    Room lookingAt = Game.getCurrentRoom();
    ArrayList<Item> itemsInRoom = lookingAt.getItems();

    public void helptext() {
        System.out.println("Shows a description of the current room, or of an item in the room, when entered as \"look item\"");
    }

    public void run() {
        System.out.println(lookingAt.look());

        if (itemsInRoom.isEmpty() == true)
            System.out.println("There aren't any items of interest in this place.");
        else {
            System.out.println("Items in this place:");
            for (Item i : itemsInRoom) {
                System.out.println(i.getName());
            }
        }

        System.out.println("Places you can go from here: ");
        for (String s : lookingAt.getExits()) {
            System.out.println(s);
        }
    }

    public void run(String itemName) {
        boolean itemFound = false;
        if (itemsInRoom.isEmpty() == true)
            System.out.println("There aren't any items in this place for you to look at.");
        else {
            for (Item i : itemsInRoom) {
                if (itemName.equals(i.getName())) {
                    System.out.println(i.look());
                    itemFound = true;
                }
            }
            if (itemFound == false)
                System.out.println("No item by that name is around here.");
        }
    }

    public boolean isGameOver() {
        return false;
    }
}