import java.util.Scanner;
public class HarmonikSayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            int n;
            System.out.print("Enter the number: ");
            n= input.nextInt();
            double result=0;
            for (double i=1; i<=n; i++){
                result+= (1.0/i);


            }
            System.out.print(result);

    }
}
