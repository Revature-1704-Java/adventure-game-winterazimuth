package com.revature.commands;

import com.revature.Player;
import com.revature.Item;
import java.util.*;

public class Inv extends Command {
    ArrayList<Item> itemsOnHand = Player.getInventory();

    public void helptext() {
        System.out.println("Shows the player's inventory -- the items being carried.");
    }

    public void run() {
        if (itemsOnHand.isEmpty() == true)
            System.out.println("You aren't carrying anything.");
        else {
            System.out.println("You are carrying:");
            for (Item i : itemsOnHand) {
                System.out.println(i.getName());
            }
        }
    }

    public boolean isGameOver() {
        return false;
    }
}