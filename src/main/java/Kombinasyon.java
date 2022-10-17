import java.util.Scanner;
public class Kombinasyon {
public static void main(String[] args) {
    int n, r, totaln = 1, totalr = 1, totalp=1, x, total;
    Scanner scan = new Scanner(System.in);
    System.out.print("n sayısını giriniz: ");
    n = scan.nextInt();
    System.out.print("r sayısını giriniz: ");
    r = scan.nextInt();

    if ( n > r ) {

        for(int i = 1; i <= n; i++) {
            totaln = totaln * i;
        }
        for(int j = 1; j<= r; j++) {
            totalr *= j;
        }

        x = n - r;

        for(int k = 1; k<= x; k++) {
            totalp *= k;
        }

        total = totaln / (totalr * totalp) ;
        System.out.println("Sonuç = " +total);

    } else {
        System.out.println("n değerini r değerinden büyük giriniz.");

    }


}
}
