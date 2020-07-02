import java.util.Scanner;

public class IfelseConditionals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        int age = scan.nextInt();

        if (age > 20) {
            System.out.println("You are an adult");
        } else if (age > 5) {
            System.out.println("You are not  kid");

        } else {
            System.out.println("you are a kid");
        }
    }
}
