package database;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> listItem = new ArrayList<>();

    public void add(Item item) {
        listItem.add(item);
    }

    public void list() {
        for (Item item : listItem) {
            item.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("那些花儿", "朴树", 10, 50, "She loves it."));
        db.add(new DVD("我也不知道", "韩寒", 120, "She loves it."));
        db.list();
    }
}
