import java.util.Scanner;
public class WhileDongusu {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int pass;
      boolean askPassword=true;
      do{
          System.out.print("Pasword: ");
          pass= input.nextInt();
          if (pass == 123){
              System.out.print("True password");
              askPassword=false;
          }else {
              System.out.println("False password");
          }
      } while (askPassword);

    }
    }

