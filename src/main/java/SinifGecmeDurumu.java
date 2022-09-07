import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double turkce, mat, fizik, kimya, muzik, toplamNot, notOrtalamasi;
        System.out.print("Türkçe notunuzu yazınız: ");
        turkce = input.nextDouble();
        System.out.print("Matematik notunuzu yazınız: ");
        mat = input.nextDouble();
        System.out.print("Fizik notunuzu yazınız: ");
        fizik = input.nextDouble();
        System.out.print("Kimya notunuzu yazınız: ");
        kimya = input.nextDouble();
        System.out.print("Müzik notunuzu yazınız: ");
        muzik = input.nextDouble();
        toplamNot = (turkce + mat + fizik + muzik + kimya);
        System.out.print("Toplam Not= " + toplamNot);

        notOrtalamasi = (toplamNot / 5);

        System.out.print("Not Ortalamanız: " + notOrtalamasi);

        if (notOrtalamasi >= 55) {
            System.out.print(" Tebrikler! Sınıfı Geçtiniz");
        } else {
            System.out.print("Üzgünüz, sınıfı geçemediniz");
        }


    }
}
