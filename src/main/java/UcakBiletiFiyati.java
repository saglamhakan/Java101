import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, yas, yolculukTipi, Fiyat;
        System.out.print("Kaç km gideceksiniz? ");
        km = input.nextDouble();
        System.out.print("Kaç yaşındasınız: ");
        yas = input.nextDouble();
        System.out.println("Hangi yolculuk türü:\n1-Tek Yön:\n2-Gidiş-Dönüş: ");
        System.out.print("Seçiminizi yapınız: ");
        yolculukTipi = input.nextDouble();
        Fiyat = km * 0.1;


        if (yas <= 12 ) {
            if (yolculukTipi == 2) {
                System.out.print("Çocuk Tarife: " + (Fiyat / 2) * 0.8);
            } else {
                System.out.print("Çocuk Tarife: " + (Fiyat / 2));

            }
        } if (yas < 24 && yas>12) {
            if (yolculukTipi == 2) {
                System.out.print("Genç Tarife" + (Fiyat * 0.9) * 0.8);
            } else {
                System.out.print("Genç Tarife" + (Fiyat * 0.9));

            }
        } if (yas > 65) {
                    if (yolculukTipi == 2) {
                        System.out.print("Yaşlı Tarife: " + (Fiyat * 0.7) * 0.8);

                    } else {
                        System.out.print("Yaşlı Tarife: " + (Fiyat * 0.7));
                    }


                }if (yas<65) {
        if  (yolculukTipi == 2) {
            System.out.print("Normal Bilet: "   + Fiyat*0.8);

            }
        }else {
            System.out.print("Normal Bilet: "   + Fiyat);
        }
            }

    }
