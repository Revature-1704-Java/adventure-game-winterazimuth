package com.revature.commands;

import com.revature.Game;
import com.revature.Room;

public class Look extends Command {
    public void helptext() {
        System.out.println("Shows a description of the current room, or of an item in the room, when entered as \"look item\"");
    }

    public void run() {
        Room lookingAt = Game.getCurrentRoom();
        System.out.println(lookingAt.look());
        System.out.println("Places you can go from here: ");
        for (String s : lookingAt.getExits()) {
            System.out.println(s);
        }
    }

    public void run(String itemName) {
        boolean answered = false;
    }
}