import java.util.Scanner;
public class ArtikYil2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter the year: ");
        year = input.nextInt();
        if (year % 4 == 0) {
            System.out.print("A leap year");
        }else {
            System.out.print("Not a leap year");
        }
    }
}
