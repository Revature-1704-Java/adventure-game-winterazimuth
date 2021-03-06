package com.revature;

import com.revature.commands.Parser;
public class Game 
{
    static String startingMessage = "";
    static String gameName = "Coffee Quest";
    static Room currentRoom;

    public static void main( String[] args )
    {
        Player you = Player.makePlayer();
        GameBuilder ourGameBuilder = new GameBuilder();
        Parser io = new Parser();

        ourGameBuilder.buildGame(gameName);

        System.out.println(startingMessage);

        io.parse();
    }

    public static void setStartingMessage(String message) {
        startingMessage = message;
    }

    public static String getGameName() {
        return gameName;
    }

    public static void setCurrentRoom(Room newCurrentRoom) {
        currentRoom = newCurrentRoom;
    }

    public static Room getCurrentRoom() {
        return currentRoom;
    }
}
