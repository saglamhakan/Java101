import java.io.InputStream;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("yasınizi giriniz");
       int yas = input.nextInt();
        System.out.println("girilen yas " + yas );

    }
}
