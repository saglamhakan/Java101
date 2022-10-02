import java.util.Scanner;
public class Bolunebilme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        int sum=0;
        int count=0;
        System.out.print("Enter the number: ");
        sayi= input.nextInt();
        for (int i=0; i<=sayi; i++){
            if (i%12==0){
                System.out.println(i+ " ");
                count++;
                sum+=i;
            }
        }System.out.println("Avarage =" +sum/count);
    }
}
