
public class Pegions {
    // main class ka under myMethod ko call krna.
    static void myMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // integer type value and print the value x.
    int x = 5;
    int y = 30;
    // Pegions class ka attribute likha hy string or int type ma.
    String kaboterName = "Golden kaboter";
    String BachaName = "Cup wala";
    int age = 5;

    public static void main(String[] args) {
        myMethod();
        // Pegions class k object banya hy.
        Pegions objPegions = new Pegions();
        // Pegions objPegions2 = new Pegions();
        objPegions.x = 50;// x ki value change ki hy or 50 set kr di hy
        System.out.println("Kaboter Name: " + objPegions.kaboterName + " " + objPegions.BachaName);
        System.out.println(" Age " + objPegions.age);// attribute ko print out krwa hy.
        // System.out.println(objPegions2.y);// change x ki value second obj banya hy or
        // y ki value print krwi hy

    }
}
