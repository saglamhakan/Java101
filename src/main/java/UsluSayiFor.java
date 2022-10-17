import java.util.Scanner;
public class UsluSayiFor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k,sum =1;
        System.out.print("Üssü alınacak sayı: ");
        n= input.nextInt();
        System.out.print("Üs alınacak sayı: ");
        k= input.nextInt();
        for (int i=1; i<=k; i++){
            sum *=n;
        }
         System.out.println("Cevap: "  +sum);

    }
}
