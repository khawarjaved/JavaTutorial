package kaboter;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("Kaboter App");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter place 1 name");
        String placeName = scanner.nextLine();
        System.out.println("Place name is: " + placeName);
        Place objPlace1 = new Place(placeName, "");
        objPlace1.GetPlace();
        objPlace1.RegisterBirds();
        objPlace1.GetBirds();

        System.out.println("Enter place 2 name");
        String placeName2 = scanner.nextLine();
        System.out.println("Place name is: " + placeName2);
        Place objPlace2 = new Place(placeName2, "");
        objPlace2.GetPlace();
        objPlace2.RegisterBirds();
        objPlace2.GetBirds();
    }

}