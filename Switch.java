import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        int age = scan.nextInt();
        // Swtich statment in java
        switch (age) {
            case 12:
                System.out.println("You are 12 year old");
                break;
            case 18:
                System.out.println("You are 18 year old");
                break;
            case 20:
                System.out.println("You are 20 year old");
                break;
            case 25:
                System.out.println("You are 25 year old");
                break;
            default:
                System.out.println("You did not match any case");
        }
    }
}
