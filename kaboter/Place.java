package kaboter;

import java.util.ArrayList;
import java.util.Scanner;

public class Place {
    ArrayList<Bird> birds;
    String PlaceName;
    String Address;

    public Place(String placeName, String address) {

        PlaceName = placeName;
        Address = address;
        birds = new ArrayList<Bird>();
    }

    public void GetPlace() {
        System.out.println("Place name: " + PlaceName + ", Address: " + Address);
    }

    public void RegisterBirds() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            System.out.println("Enter bird name " + i + " : ");
            String birdName = scanner.nextLine();
            Bird objBird = new Bird(birdName, "");
            birds.add(objBird);
        }

    }

    public void GetBirds() {
        for (int i = 0; i < birds.size(); i++) {
            System.out.println("Bird name " + (i + 1) + ": " + birds.get(i).BirdName);
        }

    }
}