
public class Array {

    public static void main(final String[] args) {
        // Array in java

        // marks[2] = 80;
        // System.out.println(marks[0]);
        // System.out.println(marks[2]);
        // All values print for loop
        // Classical way to iterate an array
        int[] marks = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            System.out.println("this is for each loop");
            // for each loop
            // for (int value : marks) {
            // System.out.println(value);

            String[] brothers = { "Mohsin jk", "Ahsan jk", "Hasan jk", "Khawar jk", "Wajid jk" };
            for (String values : brothers) {
                System.out.println(values);
            }
        }
    }
}
// }
