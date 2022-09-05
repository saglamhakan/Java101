import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        int n1,n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        n1= input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2=input.nextInt();

       System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
       System.out.print("Seçiminizi giriniz : " );
       select=input.nextInt();

      if (select==1){
          System.out.print("Toplam " + (n1+n2));
      }
      else if (select ==2){
          System.out.print("Çıkarma "  + (n1-n2));
      }else if (select ==3) {
          System.out.print("Çarpma " + (n1 * n2));
      } else if (select ==4) {
          if (n2 != 0) {
              System.out.print("Bölme " + (n1 / n2));
          } else {
              System.out.print("Bir sayı 0'a bölünemez");
          }
      }else {
              System.out.print("Yanlış seçim yaptınız. Tekrar deneyiniz");
          }

      }










    }


