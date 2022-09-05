import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double daire;
        double r,a;
        double pi = 3.14;

        System.out.print("Dairenin r değerini giriniz: ");
        r = input.nextDouble();

        System.out.print("Dairenin a değerini giriniz: " );
        a = input.nextDouble();

        double alan = pi*r*r;
        double cevre= 2*pi*r;
        double dilimAlan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alanı "  + alan);
        System.out.println("Çemberin çevresi "   + cevre);
        System.out.print("Dairenin dilimalanı: "  +dilimAlan);





    }
}
