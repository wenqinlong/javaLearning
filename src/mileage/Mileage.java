package mileage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Mileage {
    private HashMap<HashMap<String, String>, Integer> mileages = new HashMap<>();
    private ArrayList<String> city = new ArrayList<>();
    private ArrayList<Integer> mileage = new ArrayList<>();

    public void addCity(String c1) {
        city.add(c1);
    }

    public ArrayList getCity() {
        return city;
    }

    public void addMileage(int mile, int rowIndex, int colIndex) {
        HashMap<String, String> c = new HashMap<String, String>();
        mileage.add(mile);
        c.put(city.get(rowIndex), city.get(colIndex));
        mileages.put(c, mile);
    }

    public int getMileage(String c1, String c2) {
        HashMap<String, String> c = new HashMap<String, String>();
        c.put(c1, c2);
        return mileages.get(c);
    }
}
