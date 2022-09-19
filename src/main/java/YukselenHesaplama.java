import java.util.Scanner;
        public class YukselenHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*   for(int i=1;  i<=10; i++){

           if(i==5){
               System.out.print("i değeri =5");
               break;
           }
           System.out.println(i);
       }
*/
         /*  for (int i=1;   i<=10; i++){

               if (i==5){
                   continue;

               } System.out.print(i+ ",");

           }

          */
        int i = 1;
        while (i<=10){
            i++;
            if (i %2 !=0){
                continue;

            }System.out.print(i + ",");

        }
    }
}
