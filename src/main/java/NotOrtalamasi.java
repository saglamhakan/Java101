import  java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        //değişkenleri belirle
        int mat,fizik,kimya,turkce,tarih,muzik;
        //Scanner dosyası oluştur

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz:  ");
        mat = input.nextInt();

        System.out.print("fizik notunuzu giriniz:  ");
        fizik=input.nextInt();

        System.out.print("kimya notunuzu giriniz:  ");
        kimya=input.nextInt();

        System.out.print("turkce notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.print("tarih notunuzu giriniz: ");
        tarih= input.nextInt();

        System.out.print("muzik notunuzu giriniz:  ");
        muzik=input.nextInt();

        int toplam = mat+fizik+kimya+turkce+muzik+tarih;
        double ortalama = toplam/6.0;

        System.out.print("toplam" + ortalama);

        boolean kosul1 = ortalama >= 60;

        System.out.print(kosul1 ? "geçti" : "geçmedi");





    }
}
