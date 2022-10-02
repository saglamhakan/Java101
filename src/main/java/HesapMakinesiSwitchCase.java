import java.util.Scanner;
public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {

    double n1, n2;
    int select;


    Scanner inp = new Scanner(System.in);
    System.out.print("Please enter first number: ");
    n1 = inp.nextDouble();
    System.out.print("Please enter second number: ");
    n2 = inp.nextDouble();

    System.out.print("For sum:1\nFor subtraction:2\nFor multiplication: 3\nFor divide: 4\nSelect one of them: ");

    select = inp.nextInt();
    switch (select) {
        case 1:
            System.out.println("result: " + (n1 + n2));
            break;
        case 2:
            System.out.println("result: " + (n1 - n2));
            break;
        case 3:
            System.out.println("result: " + (n1 * n2));
            break;
        case 4:
            if (n2 == 0) {
                System.out.println("A number cannot be divided by zero!");
            } else {
                System.out.println("Your result: " + (n1 / n2));
            }
            break;
        default:
            System.out.println("Out of number! Please enter valid number!");
            break;
    }
}
}

