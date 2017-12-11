package com.revature.commands;

import com.revature.Game;

public class Exit extends Command {
    String whatIDo = "Exits the game";

    public void Exit() {
        System.out.println("Thank you for playing " + Game.getGameName() + "!");
    }
}