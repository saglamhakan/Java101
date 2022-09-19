import java.util.Scanner;
public class UsluSayiWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k,sum =1;
        System.out.print("Üssü alınacak sayı: ");
        n= input.nextInt();
        System.out.print("üs alınacak sayı: ");
        k= input.nextInt();
        int i=1;
        while (i<=k){
            sum *=n;
            i++;
        }
        System.out.print("Cevap: " + sum);
    }
}
