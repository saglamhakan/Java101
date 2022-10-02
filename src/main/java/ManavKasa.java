import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double elmaKg=   3.67;
        double armutKg = 2.14;
        double domatesKg = 1.11;
        double muzKg= 0.95;
        double patlicanKg = 5;
        double elma,armut,domates,muz,patlican;

        System.out.print("Kaç kg elma istersiniz: ");
        elma = input.nextDouble();

        System.out.print("Kaç kg armut istersiniz:" );
        armut=input.nextDouble();

        System.out.print("Kaç kg domates istersiniz:" );
        domates= input.nextDouble();

        System.out.print("Kaç kg muz istersiniz:" );
        muz= input.nextDouble();

        System.out.print("Kaç kg patlıcan istersiniz:" );
        patlican=input.nextDouble();

        double toplamFiyat = (elmaKg*elma)+(armutKg*armut)+(domatesKg*domates)+(muzKg*muz)+(patlicanKg*patlican);
        System.out.print("Toplam tutar "  + toplamFiyat );




        }





    }

