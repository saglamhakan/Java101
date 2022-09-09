import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear;
        System.out.print("When is your birthyear: ");
        birthYear= input.nextInt();

        if (birthYear%12==0){
            System.out.print("You are a monkey");
        } else if (birthYear%12==1) {
            System.out.print("You are a cockerel");
        } else if (birthYear%12==2) {
            System.out.print("You are a dog");
        } else if (birthYear%12==3) {
            System.out.print("You are a pig");
        } else if (birthYear%12==4) {
            System.out.print("You are a mouse");
        } else if (birthYear%12==5) {
            System.out.print("You are a bullock");
        } else if (birthYear%12==6) {
            System.out.print("You are a tiger");
        } else if (birthYear%12==7) {
            System.out.print("You are a rabbit");
        } else if (birthYear%12==8) {
            System.out.print("You are a dragon");
        } else if (birthYear%12==9) {
            System.out.print("You are a snake");
        } else if (birthYear%12==10) {
            System.out.print("You are a horse");
        }


    }
}
