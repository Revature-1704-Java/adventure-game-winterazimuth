package com.revature.commands;

import com.revature.Game;
import com.revature.Room;
import com.revature.GameBuilder;
import java.util.*;

public class Go extends Command {
    public void helptext() {
        System.out.println("This is how you go to another place in the game. Type look to see where you can go, then type \"go place\" to reach one of those nearby places.");
    }

    public void run() {
        System.out.println("Go where?");
    }

    public void run(String destination) {
        Room start = Game.getCurrentRoom();
        boolean matchFound = false;
        for (String s : start.getExits()) {
            if (destination.equals(s))
                matchFound = true;
        }
        if (matchFound == false) {
            System.out.println("That's not the name of a place you can get to from here.");
        }
        if (matchFound == true) {
            ArrayList<Room> allRooms = GameBuilder.getRoomsList();
            for (Room r : allRooms) {
                if (destination.equals(r.getName())) {
                    Game.setCurrentRoom(r);
                    System.out.println("You have arrived.");
                }
            }
        }
    }
}