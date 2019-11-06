package database;

public class VideoGame extends Item {
    private String company;
    private String style;
    private int numberOfPlayers;

    public VideoGame(String company, String title, String style, int playingTime, boolean gotIt,
                     String comment, int numberOfPlayers) {
        super(title, playingTime, gotIt, comment);
        this.numberOfPlayers = numberOfPlayers;
        this.company = company;
        this.style = style;
    }

    public void print() {
        super.print();
        System.out.println(":"+company);
    }

    public static void main(String[] args) {
        VideoGame vg = new VideoGame("Sony", "Deveon", "Action",
                50, false, "Nice", 2);
        vg.print();

    }


}
