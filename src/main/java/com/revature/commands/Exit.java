package com.revature.commands;

import com.revature.Game;

public class Exit extends Command {
    public void helptext() {
        System.out.println("Exits the game");
    }

    public void run() {
        System.out.println("Thank you for playing " + Game.getGameName() + "!");
    }
}