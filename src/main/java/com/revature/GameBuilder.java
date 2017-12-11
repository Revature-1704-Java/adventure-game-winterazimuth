package com.revature;

import java.util.*;

public class GameBuilder {
    static ArrayList<Room> rooms = new ArrayList<Room>();

    public void buildGame(String gameName) {
        if (gameName.equals("Coffee Quest") == true) {
            Game.setStartingMessage("A video game is about to begin, the epic quest of a brave hero to defeat the evil villain.\nThis is not that video game. This is backstage on the same set.\nYou are an intern tasked with bringing the hero his morning coffee before the game starts.\nUnfortunately for you, the only coffee machine is in the villain's castle, on the other side of the map...\n\n~~***COFFEE QUEST***~~~\ntype help for help");
            RoomFactory roomMaker = new RoomFactory();
            ItemFactory itemMaker = new ItemFactory();

            ArrayList<String> starterTownExits = new ArrayList<String>();
            starterTownExits.add("woods");

            ArrayList<String> magicalWoodsExits = new ArrayList<String>();
            magicalWoodsExits.add("town");

            Item coffee = itemMaker.getItem("coffee", "A cup of glorious hot coffee.");

            ArrayList<Item> noItems = new ArrayList<Item>();

            ArrayList<Item> justCoffee = new ArrayList<Item>();
            justCoffee.add(coffee);

            Room starterTown = roomMaker.getRoom("town", "This is the starter town, near the magical woods. There are plenty of stores and low-level enemies here, but you don't have to bother with that -- you're just an intern.", starterTownExits, noItems);
            Room magicalWoods = roomMaker.getRoom("woods", "These are the magical woods, full of flying pigs and tutorial fairies.", magicalWoodsExits, justCoffee);

            rooms.add(starterTown);
            rooms.add(magicalWoods);

            Game.setCurrentRoom(starterTown);
        }
    }

    public static ArrayList<Room> getRoomsList() {
        return rooms;
    }
}