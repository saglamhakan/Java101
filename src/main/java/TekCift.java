import java.util.Scanner;
public class TekCift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;

      System.out.print("n1 değerini giriniz: ");
      n1 = input.nextInt();

      if (n1%2==0){
          System.out.print("çifttir");
      }
      else{
          System.out.print("Tektir");
      }
    }
}
