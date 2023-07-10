import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz (fibonacci sayısı): ");
        int n = input.nextInt();

        System.out.println("Fibonacci Serisi : ");
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; i++ ) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }
    }

    public static class Metot {

        static void helloWorl() {
            System.out.println("Hello World !");
        }
        static int power(int base, int exp) {
            int result = 1;
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
            return result;
        }
        public static void main(String[] args) {
            System.out.println(power(2,3));
            System.out.println(power(4,2));
            helloWorl();

            /*
            int n1 = 2 , n2 = 3;
            int case1 = power(n1,n2);
            System.out.println(case1);
             */

        }
    }
}