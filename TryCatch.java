import java.security.spec.ECParameterSpec;

public class TryCatch {

    public static void main(String[] args) {
        String[] brothers = { "Mohsin jk", "Ahsan jk", "Hasan jk", "Khawar jk", "Wajid jk" };
        try {
            System.out.println(brothers[2]);
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println("Sami");
    }
}
