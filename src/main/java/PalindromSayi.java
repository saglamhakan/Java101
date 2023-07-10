public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reNumber = (reNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reNumber) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(2456));
    }
}
