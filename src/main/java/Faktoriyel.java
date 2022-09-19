import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k;
        int sum=1;
        System.out.print("Enter the number: ");
        k= input.nextInt();

        for (int i=1; i<=k; i++){

            sum=sum*i;


        } System.out.println(k  + " Faktöriyel="+ sum);

    }
}
