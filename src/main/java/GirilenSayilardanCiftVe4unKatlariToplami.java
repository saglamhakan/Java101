import java.util.Scanner;
public class GirilenSayilardanCiftVe4unKatlariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int sum=0;
        do{
            System.out.print("Enter the number: ");
            k= input.nextInt();
            if (k%2==0) {
                sum += k;
            }
            }while (k%2==0);


        System.out.println("Cevap= " + sum);


        int n;
        int total=0;
        do{
            System.out.print("Enter the second number: ");
            n= input.nextInt();
            if (n%4==0){
                total+=n;
            }
        }while (n%2==0);
        System.out.print("Total= "  + total);

        }

    }

