public class RecursiveFibonacci {
    static int isFibo(int n) {
        if(n == 1  || n == 2){
            return  1 ;
        }
        return isFibo(n - 1) + isFibo(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(isFibo(6));
    }
}
