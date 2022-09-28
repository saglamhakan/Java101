import java.util.Scanner;
public class MukemmelSayi2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i=1; i<number; i++){
            if (number%i==0){
                sum+=i;
            }
        }
        if (sum==number){
            System.out.print("Perfect Number");
        }else{
            System.out.print("Not Perfect Number");
        }

    }
}
