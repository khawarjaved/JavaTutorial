import java.util.Scanner;

public class Kaboter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // kaboter code
        int[] countings = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < countings.length; i++) {
            System.out.println(countings[i]);
            System.out.println("Pegions Bazi:\nPegion Flying Timing: 5:30 am");
            String[] kaboters = { "Badel", "Langri", "Champion", "Angraiz", "Bohchal", "Golden", "Bacha" };
            for (String values : kaboters) {
                System.out.println(values);
            }
        }

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            System.out.println("Kaboter bethna ka time:\nDealine line time 7:30 pm ");
            String[] pegions = { "Badel 12:30", "Langri 1:30", "Champion 2:30", "Angraiz 3:30", "Bohchal 4:30",
                    "Golden 5:30", "Bacha 6:30" };
            for (String values : pegions) {
                System.out.println(values);
            }
        }
        // avarage code
        {
            System.out.println("Subtraction and Average hours in all pegions: ");
            int a, b, c, d, e, f, g, sum;
            float avg;
            System.out.print("Enter first kaboter  hours : ");
            a = reader.nextInt();
            System.out.print("Enter second kaboter hours : ");
            b = reader.nextInt();
            System.out.print("Enter third kaboter hours : ");
            c = reader.nextInt();
            System.out.print("Enter four kaboter hours : ");
            d = reader.nextInt();
            System.out.print("Enter five kaboter hours : ");
            e = reader.nextInt();
            System.out.print("Enter six kaboter hours : ");
            f = reader.nextInt();
            System.out.print("Enter seven kaboter hours : ");
            g = reader.nextInt();

            sum = a + b + c + d + e + f + g;
            avg = (float) ((a + b + c + d + e + f + g) / 7);
            System.out.println("Sum Pegions hours : " + sum + "\nAverage : " + avg);
        }

        // avg kbotr
        // System.out.println("How many numbers you want to enter?");
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        /*
         * Declaring array of n elements, the value of n is provided by the user
         */
        /*
         * double[] arr = new double[n]; double total = 0;
         * 
         * for (int i = 0; i < arr.length; i++) { System.out. ("Enter Element No." + (i
         * + 1) + ": "); arr[i] = scanner.nextDouble(); } scanner.close(); for (int i =
         * 0; i < arr.length; i++) { total = total + arr[i]; }
         * 
         * double average = total / arr.length;
         * 
         * System.out.print("Sum : " + arr + "\nAverage : " + average);
         */
        // kaboter code

        String Name = reader.nextLine();

        System.out.println("Select a pegion number and show name time: (1, 2, 3, 4, 5 , 6, 7): ");
        char String = reader.next().charAt(0);

        String result;

        switch (String) {
            case '1':
                System.out.println("Badel 12:30");
                result = Name;
                break;

            case '2':
                System.out.println("Bohchal 1:30");
                result = Name;
                break;

            case '3':
                System.out.println("Angraiz 2:30");
                result = Name;
                break;

            case '4':
                System.out.println("Cup  2:30");
                result = Name;
                break;

            case '5':
                System.out.println("Langri  3:30");
                result = Name;
                break;

            case '6':
                System.out.println("Champion  4:30");
                result = Name;
                break;

            case '7':
                System.out.println("Ferozpuri  12:30");
                result = Name;
                break;

            default:
                System.out.printf("Number is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", Name, result);

    }
}