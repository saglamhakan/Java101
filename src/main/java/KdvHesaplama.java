import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar;
        double kdvOrani = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar ücretini giriniz: ");
        tutar = input.nextDouble();

        double KDVliFiyat = tutar*kdvOrani + tutar;
        double KDVsizFiyat = tutar;
        double AzKdvliFiyat = tutar*0.08 + tutar;

        System.out.println("Toplam Fiyat"  + KDVliFiyat);
        System.out.println("tutar"       +    tutar);
        System.out.println("kdvOrani" + kdvOrani);

        boolean kosul1 = tutar >= 1000;


        System.out.println(kosul1 ?  KDVliFiyat : AzKdvliFiyat  );



        }
    }

