package kaboter;

public class Bird {

    String BirdName;
    String BirdColor;

    public Bird(String birdName, String birdColor) {
        BirdName = birdName;
        BirdColor = birdColor;

    }

    public void GetBird() {
        System.out.println("Bird name: " + BirdName);

    }
}
