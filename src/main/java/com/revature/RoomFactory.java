package com.revature;

import java.util.*;

public class RoomFactory {
    public Room getRoom(String name, String description, ArrayList<String> exits, ArrayList<Item> items) {
        Room newRoom = new Room();
        newRoom.setName(name);
        newRoom.setDescription(description);
        newRoom.setExits(exits);
        newRoom.setItems(items);
        return newRoom;
    }
}