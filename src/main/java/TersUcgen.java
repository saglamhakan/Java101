import java.util.Scanner;
public class TersUcgen {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for ( int i = n-1 ; i >= 0; i--) {
            for (int m = (n - i); m > 0; m--){
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k-- ) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}