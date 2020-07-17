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
        System.out.println("Place name: " + PlaceName + ",   Address: " + Address);
    }

    public void RegisterBirds() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            System.out.println("Enter bird name " + i + " : ");
            String birdName = scanner.nextLine();
            System.out.println("Enter bird color " + i + " : ");
            String birdColor = scanner.nextLine();
            System.out.println("Enter bird fly time " + i + " : ");
            String birdTime = scanner.nextLine();
            Bird objBird = new Bird(birdName, birdColor, birdTime);
            birds.add(objBird);
        }

    }

    public void GetBirds() {
        for (int i = 0; i < birds.size(); i++) {
            System.out.println("Bird name " + (i + 1) + ": " + birds.get(i).BirdName + ":  " + birds.get(i).BirdColor
                    + ": " + birds.get(i).BirdTime);
            // System.out.println("Bird color " + (i + 1) + ": " + birds.get(i).BirdColor);
            // System.out.println("Bird time " + (i + 1) + ": " + birds.get(i).BirdTime);
        }
    }

    /*
     * public void GetBirdsTime() { for (int j = 0; j < birds.size(); j++) {
     * System.out.println("Bird time " + (j + 1) + ": " + birds.get(j).BirdTime); }
     * }
     * 
     * public void GetBirdsColor() { for (int k = 0; k < birds.size(); k++) {
     * System.out.println("Bird time " + (k + 1) + ": " + birds.get(k).BirdTime); }
     * }
     */
}