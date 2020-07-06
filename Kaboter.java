import java.util.Scanner;

public class Kaboter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Pegions Name: ");
        System.out.println("Pegion Flying Timing: 5:30am ");
        String[] pegions = { "Badel", "Langri", "Champion", "Angraiz", "Bohchal", "Golden", "Bacha" };
        for (String values : pegions) {
            System.out.println(values);
        }
        float number_1, number_2;
        System.out.println("Enter first number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        System.out.println("Enter second number");
        // Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("you have entered");
        System.out.print(number_1);
        System.out.print("and");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication, and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding these number");
                System.out.print("The result is:");
                System.out.println(number_1 + number_2);
                break;
            case 1:
                System.out.println("subtraction these number");
                System.out.print("The result is:");
                System.out.println(number_1 - number_2);
                break;
            case 2:
                System.out.println("multiplication these number");
                System.out.print("The result is:");
                System.out.println(number_1 * number_2);
                break;
            case 3:
                System.out.println("division these number");
                System.out.print("The result is:");
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
