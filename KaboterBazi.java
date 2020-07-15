import java.util.Scanner;

public class KaboterBazi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // String and int type Array
        int[] countings = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < countings.length; i++) {
            System.out.println(countings[i]);
            System.out.println("Chat Name Mehbob Jutt: \nPegions Bazi:\nPegion Flying Timing: 5:30 am");
            String[] kaboters = { "Cheena", "Lakway wala", "King", "Zeera", "Jonsra", "Tadi", "Lakha" };
            for (String values : kaboters) {
                System.out.println(values);
            }
        }
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            System.out.println("Chat Name Mehbob Jutt: \nKaboter bethna ka time:\nDealine line time 7:30 pm ");
            String[] pegions = { "Cheena 12:00", "Lakway wala 1:00", "King 2:50", "Zeera 3:40", "Jonsra 4:10",
                    "Tadi 5:20", "Lakha 7:20" };
            for (String values : pegions) {
                System.out.println(values);

            }
            // Class and funtion calling
            {
                Counte counteObj = new Counte();
                counteObj.Average();

            }
            Counte counteObj = new Counte();
            counteObj.Select();

        }
    }
}