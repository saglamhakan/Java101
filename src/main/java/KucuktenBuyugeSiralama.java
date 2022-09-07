import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("n1 değerini giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 değerini giriniz: ");
        n2 = input.nextInt();
        System.out.print("n3 değerini giriniz: ");
        n3 = input.nextInt();

        //n1<n2 v2 n2<n3 n1 en küçüktür.
        //n3>n2 v2 n3>n1 ise n3 en büyüktür

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                System.out.println("n1<n2<n3");
            } else {
                System.out.println("n1<n3<n2");
            }
        }
        if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                System.out.println("n2<n1<n3");
            } else {
                System.out.println("n2<n3<n1");
            }

        }
        if ((n3 < n1) && (n3 < n2)) {
            if (n1 < n2) {
                System.out.println("n3<n1<n2");
            } else {
                System.out.println("n3<n2<n1");
            }
        }
    }
}



