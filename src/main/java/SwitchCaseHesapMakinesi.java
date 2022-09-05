import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 değerini giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 değerini giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama:\n2-Çıkarma:\n3-Çarpma:\n4-Bölme:");
        System.out.print("Yapmak istediğiniz işlemi girin: ");
        select = input.nextInt();

        switch (select) {
            case (1):
                System.out.print("Sonuç: " + (n1 + n2));
                break;
            case (2):
                System.out.print("Sonuç: " + (n1 - n2));
                break;
            case (3):
                System.out.print("Sonuç: " + (n1 * n2));
                break;
            case (4):
                if (n2 != 0) {
                    System.out.print("Sonuç: " + (n1 / n2));
                    break;
                } else {
                    System.out.print("Bir sayı 0'a bölünemez  ");
                }

            default:
                System.out.print("Hatalı giriş yaptınız");


        }
    }
}
