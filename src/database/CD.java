package database;

import java.util.ArrayList;

public class CD extends Item {
    private String artist;
    private int numOfTrack;


    public CD(String title, String artist, int numOfTrack, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numOfTrack = numOfTrack;
    }


    public void print() {
        super.print();
        System.out.println(":" + artist);
    }

    @Override
    public boolean equals(Object obj) {
        CD cd = (CD)obj;
        return artist.equals(((CD) obj).artist);
    }

    public static void main(String[] args) {
        CD cd = new CD("Nonsense", "Eve",10, 50, "Good");
        CD cd1 = new CD("Nonsense", "Eve",10, 50, "Good");

        System.out.println(cd.equals(cd1));
    }
}
