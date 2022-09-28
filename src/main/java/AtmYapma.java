import java.util.Scanner;
public class AtmYapma {
    public static void main(String[] args) {
        String userName, password;
        int right=3;
        int select;
        int balance =2000;
        while (right>0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the username: ");
            userName = input.nextLine();
            System.out.print("Enter the password: ");
            password = input.nextLine();
            if (userName.equals("hakki") && password.equals("aslanamca")) {
                System.out.println("Welcome to Hakkı Bank");
                do {
                    System.out.println("1-Para çekme:\n2-Para yatırma:\n3-Bakiye sorma:\n4-Çıkış yapınız:");
                    System.out.print("Seçim Yapınız:");
                    select=input.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("İnsufficient balance: ");

                        } else {
                            balance -= price;
                        }
                    } else if (select == 2) {
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        balance += price;


                    } else if (select == 3) {
                        System.out.println("Your balance: " + balance);


                    }
                } while (select != 4);
                break;

            }  else{
                    right--;
                    System.out.println("Wrong Login, try again");
                    if (right == 0) {
                        System.out.print("Your account bloked");
                    } else {
                        System.out.println("Kalan Bakiye:" + right);
                    }
                }
            }
        }
    }


