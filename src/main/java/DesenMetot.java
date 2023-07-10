import java.util.Scanner;
public class DesenMetot {
    static void pattern(int n) {
        if (n <= 0) {
            System.out.println("Son Değer : " + n);
            return;
        }else {
            System.out.println("Çıkarma İşlemi Yapıldı : " + n);
            pattern(n - 5);
            System.out.println("Ekleme işlemi yapıldı : " + n);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();
        pattern(n);

    }
}