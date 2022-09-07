import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kayak, sinema, piknik, yuzme, sicaklik;
        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik = input.nextInt();
        if (sicaklik < 5) {
            System.out.print("Kayak yapınız");

        } else if (sicaklik < 15) {
            System.out.print("Sinemaya gidebilirsiniz");

        }
        else if (sicaklik<25){
            System.out.print("Pikniğe gidebilirsiniz");

        } else {
            System.out.print("Yüzmeye gidebilirsiniz");
            
        }
    }
}


