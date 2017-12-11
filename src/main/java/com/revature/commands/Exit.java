package com.revature.commands;

import com.revature.Game;

public class Exit extends Command {
    private static String victoryText;

    public void helptext() {
        System.out.println("Exits the game");
    }

    public void run() {
        System.out.println("Thank you for playing " + Game.getGameName() + "!");
    }

    public static void setVictoryText(String newVictoryText) {
        victoryText = newVictoryText;
    }

    public static String getVictoryText() {
        return victoryText;
    }

    public boolean isGameOver() {
        return false;
    }
}