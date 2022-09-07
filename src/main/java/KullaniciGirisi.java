import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("Hakan") && password.equals("aslanamca")) {
            System.out.print(" Başarılı giriş");
        } else {
            System.out.print("Şifrenizi yanlış girdiniz\nŞifrenizi sıfırlamak ister misiniz?: ");
            password = input.nextLine();
            if (password.equals("evet")) {
                System.out.print("Yeni Şifreyi Giriniz: ");
                password = input.nextLine();

            }

            if (password.equals("aslanamca")) {
                System.out.print("Yeni şifre eskisiyle aynı olamaz ");
            } else {
                System.out.print("Şifre başarıyla oluşturuldu. ");

            }


        }


    }


}

