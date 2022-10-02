import java.util.Scanner;
public class GirilenSayilardan4ve5inKatlariToplami{
        public static void main(String[] args) {
            int n;
            Scanner input = new Scanner(System.in);
            System.out.print("Sınır sayısını giriniz: ");
            n = input.nextInt();

            for(int i = 1; i <= n; i *= 4) {
                System.out.println("4'ün kuvvetleri: " +i);
            }

            for(int i = 1; i <= n; i *= 5) {
                System.out.println("5'in kuvvetleri: " +i);
            }
        }

}

