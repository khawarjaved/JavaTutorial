import java.util.Scanner;

public class BaziiTime {
    public void FlyingAverageKaboter() {
        Scanner reader = new Scanner(System.in);

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

}