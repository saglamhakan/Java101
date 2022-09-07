import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("When your birtmonth: ");
        month = input.nextInt();
        System.out.print("When your birthday: ");
        day = input.nextInt();
        if (month == 1) {
            if (day < 21 ) {
                System.out.println("Oğlak burcusunuz ");
            } else {
                System.out.println("Kova burcusunuz");
            }
        }
        if (month == 2 && day <31) {
            if (day < 19  ) {
                System.out.println("Kova burcusunuz");
            } else {
                System.out.println("Balık burcusunuz");
            }

        }
        if (month == 3 && day <31) {
            if (day < 20 ) {
                System.out.println("Balık burcusunuz");
            } else {
                System.out.println("Koç burcusunuz");
            }
        }
        if (month == 4 && day <31 ) {
            if (day < 20 ) {
                System.out.println("Koç burcusunuz");
            } else {
                System.out.println("Boğa burcusunuz");
            }
        }
        if (month == 5 && day <31) {
            if (day < 21  ) {
                System.out.println("Boğa burcusunuz");
            } else {
                System.out.println("İkizler burcusunuz");
            }
        }
        if (month == 6 && day <31) {
            if (day < 22 ) {
                System.out.println("İkizler burcusunuz");
            } else {
                System.out.println("Yengeç burcusunuz");
            }
        }
        if (month == 7 && day <31) {
            if (day < 22  ) {
                System.out.println("Yengeç burcusunuz");
            } else {
                System.out.println("Aslan burcusunuz");
            }
        }
        if (month == 8 && day <31) {
            if (day < 22 ) {
                System.out.println("Aslan burcusunuz");
            } else {
                System.out.println("Başak burcusunuz");
            }
        }
        if (month == 9 && day <31) {
            if (day < 22 ) {
                System.out.println("Başak burcusunuz");
            } else {
                System.out.println("Terazi burcusunuz");
            }
        }
        if (month == 10 && day <31) {
            if (day < 23 ) {
                System.out.println("Terazi burcusunuz");
            } else {
                System.out.println("Akrep burcusunuz");
            }
        }
        if (month == 11 && day <31) {
            if (day < 21  ) {
                System.out.println("Akrep burcusunuz");
            } else {
                System.out.println("Yay burcusunuz");
            }
        }
        if (month == 12 && day <31 ) {
            if (day < 21  ) {
                System.out.println("Yay burcusunuz");
            } else {
                System.out.println("Oğlak burcusunuz");
            }
        }if (month>12) {
          System.out.println("Hatalı giriş");

        {}

        }if(day>31){
            System.out.println("Hatalı giriş");
        }

    }

    }

