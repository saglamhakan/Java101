import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double kilo,boy;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz:" );
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz:" );
        kilo=input.nextDouble();

        double vucutkitleindeksi = kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz:"   + vucutkitleindeksi);

    }
}
