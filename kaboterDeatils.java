import java.util.Scanner;

public class kaboterDeatils {
    public void SelectKaboterDetail() {
        Scanner reader = new Scanner(System.in);
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
