import java.util.Scanner;
public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Enter the number: ");
        sayi=input.nextInt();
        for (int i=1; i<=sayi; i++){
            if (i%2==0){
                System.out.print(i+ " ");
            }

        }


    }
}