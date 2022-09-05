import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
            System.out.print("Yılı giriniz: ");
            yil = input.nextInt();

            if (yil%4==0){
                System.out.print("Artık yıldır");

                }else {
                System.out.print("Artık Yıl Değildir" );
            }
    }
}
