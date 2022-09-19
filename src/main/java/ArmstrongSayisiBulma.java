public class ArmstrongSayisiBulma {
    public static void main(String[] args) {
        int a = 2451, basamaksayisi = 0, numberCounter = 0;
// basamak sayısı bulma işlemi


        while (a != 0) {
            numberCounter++;
            a /= 10;
        }
// son basamağı bulma işlemi
// 2451 % 10==1
        int b = 2451;
        int c = b / 10;
// üs alma
        int oneNumber =3;
        int secondNumber=2;
        int result=1;
        for (int i=1; i<=secondNumber; i++){
            result*=oneNumber;
        }
        System.out.println(result);
    }
}
