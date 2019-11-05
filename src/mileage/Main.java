package mileage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mileage mlg = new Mileage();
        Scanner in = new Scanner(System.in);

        int num = 0;
        String city;

        while (true) {
            city = in.next();
            if (city.equals("###")) {
                break;
            }
            mlg.addCity(city);

        }

        for (int i=0; i<mlg.getCity().size()*mlg.getCity().size(); i++) {
            num = in.nextInt();
            mlg.addMileage(num, i/3,i%3);
        }

        String c1 = in.next();
        String c2 = in.next();
        System.out.println(mlg.getMileage(c1, c2));
    }
}
