import java.util.Scanner;
public class HarmonikSayiWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double n;
        double i=1;
        double result = 0;
        System.out.print("Enter the number: ");
        n= input.nextDouble();

        while (i<=n){
            result+=(1.0/i);
            i++;


        }
        System.out.println("Cevap= " + result);

    }
}
