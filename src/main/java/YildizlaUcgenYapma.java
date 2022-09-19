import java.util.Scanner;
public class YildizlaUcgenYapma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int n= input.nextInt();

        for (int i=1; i<=6; i++){
         for (int k=1; k<=(n-i); k++){
             System.out.print(" ");
         }
            System.out.println(i);
        }

    }
}
