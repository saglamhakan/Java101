import java.util.Scanner;

public class MayinTarlasiSonuc{
public static void main(String[] args) {
    System.out.println("Welcome to MineSweeper!");
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter the number of rows: ");
    int r = scan.nextInt();
    System.out.print("Please enter the number of columns: ");
    int c = scan.nextInt();

 MayinTarlasi mine = new MayinTarlasi(r, c);

    mine.printArea();

    do {
        System.out.print("Enter the row: ");
        r = scan.nextInt();
        System.out.print("Enter the column: ");
        c = scan.nextInt();
        mine.sweep(r, c);
    }

    while (!mine.isGameOver);

}
}

