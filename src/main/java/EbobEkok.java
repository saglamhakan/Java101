import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok=1;
        System.out.print("Enter the one number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();
        // döngü daha fazla
   /*     for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.print("Ebob: " + ebob);
        // döngü daha az

        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
        }
*/
           for (int i=1; i<=n1*n2; i++){
               if (i%n1==0 && i%n2==0){
                   System.out.print("Ekok= " +i);
                   break;
               }


               }
           }

        }

