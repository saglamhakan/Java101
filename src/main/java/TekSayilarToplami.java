import java.util.Scanner;
public class TekSayilarToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;

        do{
        System.out.print("Enter the number: ");
        number= input.nextInt();
        if (number%2==1){
            sum+=number;
        }
        }while (number>0);

        System.out.print("Toplam= " +sum);}


    }

