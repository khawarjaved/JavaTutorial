import java.util.Scanner;

public class Kaboter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // String and int type Array
        int[] countings = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < countings.length; i++) {
            System.out.println(countings[i]);
            System.out.println("Chat Name Guddo Mayo: \nPegions Bazi:\nPegion Flying Timing: 5:30 am");
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
        // Class and funtion calling
        {
            Counte counteObj = new Counte();
            counteObj.Average();

        }
        Counte counteObj = new Counte();
        counteObj.Select();

    }
}