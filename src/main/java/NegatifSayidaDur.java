import java.util.Scanner;

public class NegatifSayidaDur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        /*
        for (boolean run = true; run; ) {
            System.out.print("Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (sayi < 0) {
                run = false;

            }
        }

         */


//        do {
//            System.out.print("Sayıyı giriniz: ");
//            sayi = input.nextInt();
//        } while (sayi > 0);
//        System.out.print("sayi 0 dan kucuk");
//
//    }


        // Declaring and initializing integer values
        int x = 21, sum = 0;

        // Do-while loop
        do {

            // Execution statements(Body of loop)

            // Here, the line will be printed even
            // if the condition is false
            sum = x;

            //21+20+19+18....+11
            x--;
            System.out.println(sum);
        }

        // Now checking condition
        while (x > 10);

        // Summing up
        System.out.println("Summation: " + sum);
    }
}



