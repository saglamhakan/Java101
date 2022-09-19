import java.util.Scanner;
public class EnBuyukVeEnKucukSayiyiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int n = scan.nextInt();
        int k;
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++) {
            System.out.println(i+". Sayıyı giriniz :");
            k = scan.nextInt();
            if(min > k) min = k;
            else if(max < k) max = k;
        }

        System.out.println("En büyük sayı :"+max+"\nEn küçük sayı :"+min);


    }
}
