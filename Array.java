
public class Array {

    public static void main(final String[] args) {
        // Array in java
        int[] marks = { 10, 20, 30, 40 };
        marks[2] = 80;
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        // All values print for loop
        // Classical way to iterate an array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            System.out.println("this is for each loop");
            // for each loop
            for (int value : marks) {
                System.out.println(value);
            }
        }
    }
}
