import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 1;
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum *= i;}

                }
                    if (sum == n) {
                        System.out.println("Perfect Number");
                    } else {
                        System.out.println("Not Perfect Number");
                    }
                }

            }


