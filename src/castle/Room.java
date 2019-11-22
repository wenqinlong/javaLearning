package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    // initialization
    public Room(String description) {
        this.description = description;
    }

    public void setExit(String direction, Room room) {
        exits.put(direction, room);
    }

    @Override
    public String toString() {
        return description;
    }

    public String getExitDesc() {
        StringBuffer sb = new StringBuffer();  // StringBuffer 是一种可以修改的对象
        for (String direction : exits.keySet()) {
            sb.append(direction);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
}