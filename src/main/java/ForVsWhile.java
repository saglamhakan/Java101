import java.util.Scanner;
public class ForVsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
      /*   for( boolean run =true; run;){
         System.out.print("Enter Number: ");
           sayi= input.nextInt();
           if(sayi<0){
              run=false;
             System.out.print("Thank you");
          }
         }

        System.out.print("Enter the number: ");
        sayi = input.nextInt();
     while (sayi > 0) {
                System.out.print("Enter the number: ");
                sayi = input.nextInt();

            }
}


   */
    do {
        System.out.print("Enter the number: ");
        sayi = input.nextInt();
    } while (sayi>0);


    }
}
