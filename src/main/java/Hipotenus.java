import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ucgen;
        double kisaKenar, uzunKenar;
        double Hipotenus;

        System.out.print("Üçgenin kisa kenarını yazınız:    ");
        kisaKenar = input.nextDouble();

        System.out.print("Üçgenin uzun kenarını yazınız:    ");
        uzunKenar=input.nextDouble();

       Hipotenus = Math.sqrt((kisaKenar*kisaKenar) + (uzunKenar*uzunKenar));

       System.out.print("Hipotenüs  "  + Hipotenus);


    }
}
