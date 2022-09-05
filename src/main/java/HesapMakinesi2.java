import java.util.Scanner;
public class HesapMakinesi2 {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 değerini giriniz:");
        n1 = input.nextInt();
        System.out.print("n2 değerini giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama:\n2-Çıkarma:\n3-Çarpma\n4-Bölme:");
        System.out.print("Seçiminizi giriniz:");
        select = input.nextInt();

        if (select == 1) {
            System.out.print("Sonuç: " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("Sonuç: " + (n1 - n2));
        } else if (select == 3) {
            System.out.print("Sonuç: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("Sonuç: " + (n1 / n2));
            } else  {
                System.out.print("Hiçbir sayı 0'a bölünemez");
            }
        }else{
            System.out.print("Yanlış seçim yaptınız!");
        }
    }
            }



