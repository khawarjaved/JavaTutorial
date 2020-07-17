import java.util.ArrayList;
import java.time.LocalDate;

public class Kaboter {
    // class ka attribute declear kiya hy.
    String ChatName = "Gudoo Mayo";
    String KaboterBazi = "Lahori Rules Bazi";

    public static void main(String[] args) {
        // date ko likhna ka trika object bana kr.
        LocalDate objLocalDate = LocalDate.now();
        System.out.println(objLocalDate);
        // attribute call krna ka trika
        Kaboter myObj = new Kaboter();
        System.out.println("Chat Name: " + myObj.ChatName + "\n" + myObj.KaboterBazi);
        System.out.println("Pegion Flying Timing: 5:30 am");
        // string array list jis ma pegions ka name hy.
        ArrayList<String> pegions = new ArrayList<String>();
        pegions.add("Badel");
        pegions.add("Langri");
        pegions.add("Champion");
        pegions.add("Angraiz");
        pegions.add("Bohchal");
        pegions.add("Golden");
        pegions.add("Bacha");
        // int type Array
        int[] countings = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < countings.length; i++) {
            System.out.println(countings[i]);
            for (String values : pegions) {
                System.out.println(values);
            }
        }
        // string array list jis ma pegions ka name hy.
        System.out.println("Kaboter bethna ka time:\nDeadline line time 7:30 pm ");
        ArrayList<String> pegionstime = new ArrayList<String>();
        pegionstime.add("Badel 1:00");
        pegionstime.add("Langri 2:45");
        pegionstime.add("Champion 3:23");
        pegionstime.add("Angraiz 4:00");
        pegionstime.add("Bohchal 5:25");
        pegionstime.add("Golden 6:00");
        pegionstime.add("Bacha 6:40");
        // int type array
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            for (String values : pegionstime) {
                System.out.println(values);
            }
        }
        // Class and method call kiya hy.
        // public class k liya object ban,na pry ga class name k.
        {
            BaziiTime objBazii = new BaziiTime();
            // method ko call krna k liya
            objBazii.FlyingAverageKaboter();

        }
        kaboterDeatils objBazii = new kaboterDeatils();
        // method ko call krna k liya.
        objBazii.SelectKaboterDetail();

    }
}