import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri yaz
        int tost,ayran,simit,salgam;

        // fiyat bilgisi için Scanner dosyası oluştur
        Scanner input = new Scanner(System.in);

        System.out.print("tost fiyatı girin:    ");
        tost=input.nextInt();

        System.out.print("ayran fiyatını girin:    ");
        ayran=input.nextInt();

        System.out.print("simit fiyatını girin: ");
        simit=input.nextInt();

        System.out.print("salgam fiyatını girin:   ");
        salgam=input.nextInt();


        int toplam = (tost+ayran+simit+salgam);
        double ortalama = toplam/4.0;

        System.out.print("toplam" + ortalama);


    }
}
