package com.revature.commands;

import com.revature.Player;
import com.revature.Item;
import com.revature.Room;
import com.revature.Game;
import com.revature.GameBuilder;
import java.util.*;

public class Get extends Command {
    Room inside = Game.getCurrentRoom();
    ArrayList<Item> itemsInRoom = inside.getItems();
    private boolean hasVictoryItem = false;

    public void helptext() {
        System.out.println("With this command, you can take an item from the surrounding area and take it with you. Just type \"get item\"");
    }

    public void run() {
        System.out.println("Get what?");
    }

    public void run(String itemName) {
        boolean itemFound = false;
        if (itemsInRoom.isEmpty() == true)
            System.out.println("There aren't any items in this place for you to get.");
        else {
            for (Item i : itemsInRoom) {
                if (itemName.equals(i.getName())) {
                       if (itemName.equals(GameBuilder.victoryItemName)) {
                           System.out.println(Exit.getVictoryText());
                           Exit win = new Exit();
                           win.run();
                           hasVictoryItem = true;
                       }
                    /*
                    System.out.println("You take the " + i.getName() + ".");
                    ArrayList<Item> playerItems = Player.getInventory();
                    playerItems.add(i);
                    Player.setInventory(playerItems);
                    itemsInRoom.remove(i);
                    inside.setItems(itemsInRoom);
                    Game.setCurrentRoom(inside);
                    GameBuilder.removeRoom(inside.getName());
                    GameBuilder.addRoom(inside);
                    */
                    itemFound = true;
                }
            }
            if (itemFound == false)
                System.out.println("No item by that name is around here.");
        }
    }

    public boolean isGameOver() {
        return hasVictoryItem;
    }
}