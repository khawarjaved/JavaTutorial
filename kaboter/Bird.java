package kaboter;

public class Bird {

    String BirdName;
    String BirdColor;
    String BirdTime;

    public Bird(String birdName, String birdColor, String birdTime) {
        BirdName = birdName;
        BirdColor = birdColor;
        BirdTime = birdTime;

    }

    public void GetBird() {
        System.out.println("Bird name: " + BirdName + "Bird time: " + BirdTime + "Bird color: " + BirdColor);

    }

    // public void GetBirdTime() {
    // System.out.println("Bird time: " + BirdTime);
    // }

    // public void GetBirdColor() {
    // System.out.println("Bird color: " + BirdColor);
    // }
}
