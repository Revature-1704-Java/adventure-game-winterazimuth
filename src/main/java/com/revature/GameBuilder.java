package com.revature;

import java.util.*;
import com.revature.commands.Exit;

public class GameBuilder {
    static ArrayList<Room> rooms = new ArrayList<Room>();
    public static String victoryItemName;

    public void buildGame(String gameName) {
        if (gameName.equals("Coffee Quest") == true) {
            Game.setStartingMessage("A video game is about to begin, the epic quest of a brave hero to defeat the evil villain.\nThis is not that video game. This is backstage on the same set.\nYou are an intern tasked with bringing the hero his morning coffee before the game starts.\nUnfortunately for you, the only coffee machine is in the villain's castle, on the other side of the map...\n\n~~***COFFEE QUEST***~~~\ntype help for help");
            RoomFactory roomMaker = new RoomFactory();
            ItemFactory itemMaker = new ItemFactory();

            ArrayList<String> starterTownExits = new ArrayList<String>();
            starterTownExits.add("woods");
            ArrayList<String> magicalWoodsExits = new ArrayList<String>();
            magicalWoodsExits.add("town");
            magicalWoodsExits.add("mountains");
            magicalWoodsExits.add("mines");
            ArrayList<String> icyMountainsExits = new ArrayList<String>();
            icyMountainsExits.add("woods");
            icyMountainsExits.add("desert");
            ArrayList<String> crystalMinesExits = new ArrayList<String>();
            crystalMinesExits.add("woods");
            crystalMinesExits.add("caves");
            ArrayList<String> pyramidDesertExits = new ArrayList<String>();
            pyramidDesertExits.add("mountains");
            pyramidDesertExits.add("jungle");
            ArrayList<String> underwaterCavesExits = new ArrayList<String>();
            underwaterCavesExits.add("mines");
            underwaterCavesExits.add("jungle");
            ArrayList<String> dinosaurJungleExits = new ArrayList<String>();
            dinosaurJungleExits.add("caves");
            dinosaurJungleExits.add("desert");
            dinosaurJungleExits.add("factory");
            dinosaurJungleExits.add("sewer");
            ArrayList<String> robotFactoryExits = new ArrayList<String>();
            robotFactoryExits.add("jungle");
            robotFactoryExits.add("volcano");
            ArrayList<String> mutantSewerExits = new ArrayList<String>();
            mutantSewerExits.add("jungle");
            mutantSewerExits.add("castle");
            ArrayList<String> volcanoLairExits = new ArrayList<String>();
            volcanoLairExits.add("factory");
            volcanoLairExits.add("tower");
            ArrayList<String> undeadCastleExits = new ArrayList<String>();
            undeadCastleExits.add("sewer");
            undeadCastleExits.add("tower");
            ArrayList<String> dimensionTowerExits = new ArrayList<String>();
            dimensionTowerExits.add("castle");
            dimensionTowerExits.add("volcano");

            Item coffee = itemMaker.getItem("coffee", "A cup of glorious hot coffee.");

            ArrayList<Item> noItems = new ArrayList<Item>();
            ArrayList<Item> justCoffee = new ArrayList<Item>();
            justCoffee.add(coffee);

            Room starterTown = roomMaker.getRoom("town", "This is the starter town, near the magical woods. There are plenty of stores and low-level enemies here, but you don't have to bother with that -- you're just an intern.", starterTownExits, noItems);
            Room magicalWoods = roomMaker.getRoom("woods", "These are the magical woods, full of flying pigs and tutorial fairies.", magicalWoodsExits, noItems);
            Room icyMountains = roomMaker.getRoom("mountains", "These icy mountains are full of penguins, yetis, slippery surfaces, and sheer drops. You take the ski lift.", icyMountainsExits, noItems);
            Room crystalMines = roomMaker.getRoom("mines", "You enter the crystal mines, full of mine cart shenanigans, burrowing creatures, and maybe a balrog or two. You heard there used to be a secret level in here, before the miners dug too deep.", crystalMinesExits, noItems);
            Room pyramidDesert = roomMaker.getRoom("desert", "You're in the Pyramid Desert. Sherrifs on flying carpets are fighting mummies on giant sandworms.", pyramidDesertExits, noItems);
            Room underwaterCaves = roomMaker.getRoom("caves", "You strap on a SCUBA suit and dive into the underwater caves. It takes a while to get used to the new controls, which makes the pirannhas more annoying.", underwaterCavesExits, noItems);
            Room dinosaurJungle = roomMaker.getRoom("jungle", "Welcome to the Dinosaur Jungle! Lots of ancient ruins around here. Runoff from the villain's factory and sewers is producing mutant dinosaurs.", dinosaurJungleExits, noItems);
            Room robotFactory = roomMaker.getRoom("factory", "The robot factory is full of grinding machinery, red-hot metal, automated defenses, and a loud, awesome soundtrack.", robotFactoryExits, noItems);
            Room mutantSewer = roomMaker.getRoom("sewer", "The sewers are weirdly spacious and convoluted for just being sewers. They're packed with mutant monsters and enough pipe-based puzzles to send anyone looking for a walkthrough.", mutantSewerExits, noItems);
            Room volcanoLair = roomMaker.getRoom("volcano", "Behold the volcano lair! Guarded by a cybernetic dragon who puts on a good act for the game but is a sweet person off-stage. He makes the best lemon cupcakes, really.", volcanoLairExits, noItems);
            Room undeadCastle = roomMaker.getRoom("castle", "Now you're on the villain's doorstep, the spooky castle of the undead. Some vampires are filing a complaint with HR about garlic in their pizza.", undeadCastleExits, noItems);
            Room dimensionTower = roomMaker.getRoom("tower", "Here it is. The final level, throne room of the villain, at the top of a tower that goes beyond space and time to some kind of swirly technicolor background for the final boss fight. Half a wall is taken up by gleaming coffee-producing machinery.", dimensionTowerExits, justCoffee);

            rooms.add(starterTown);
            rooms.add(magicalWoods);
            rooms.add(icyMountains);
            rooms.add(crystalMines);
            rooms.add(pyramidDesert);
            rooms.add(underwaterCaves);
            rooms.add(dinosaurJungle);
            rooms.add(robotFactory);
            rooms.add(mutantSewer);
            rooms.add(volcanoLair);
            rooms.add(undeadCastle);
            rooms.add(dimensionTower);

            Game.setCurrentRoom(starterTown);

            Exit.setVictoryText("At last, you hold the coffee in your hands! Who cares about the hero? You drink it yourself.\nIt's perfect.");
            victoryItemName = "coffee";
        }
    }

    public static ArrayList<Room> getRoomsList() {
        return rooms;
    }

    public static void addRoom(Room newRoom) {
        rooms.add(newRoom);
    }

    public static void removeRoom(String roomName) throws ConcurrentModificationException {
        for (Room r : rooms) {
            if (roomName.equals(r.getName())) {
                r.setName("");
            }
        }
    }
}