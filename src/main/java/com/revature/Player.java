package com.revature;

public class Player {
    private static Player PLAYER;

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
}