import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {

        double ucgen;
        double a,b,c;

        Scanner girdi =new Scanner(System.in);

        System.out.print("a kenarını giriniz: " );
        a= girdi.nextDouble();
        System.out.print("b kenarını giriniz: ") ;
        b= girdi.nextDouble();
        System.out.print("c kenarını giriniz: ");
        c= girdi.nextDouble();

        double u = (a+b+c)/2;
        double alan = Math.sqrt (u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı: " + alan);

    }
}
