import java.util.Scanner;
public class IkininKuvvetleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number= input.nextInt();
        System.out.println("4ün kuvvetleri: ");
        for (int i=1; i<number; i*=4){
            System.out.println(i + " ");

        }
         System.out.println("5in kuvvetleri: ");
        for (int i=1; i<number; i*=5)
            System.out.println(i+ " ");

        }

    }

