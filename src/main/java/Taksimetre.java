import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km;
        double perKm = 2.2, total;

        System.out.print("Kaç gideceğinizi yazınız: " );
        km = input.nextDouble();
        total = km*perKm + 10;

        total = (total<20) ? 20 : total;
        System.out.print(total);
        }


    }

