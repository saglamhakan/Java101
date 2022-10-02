public class DizidekiMaksimumVeMinimumDegerler {
    public static void main(String[] args) {
        int[] list={-5,-50,200,4,5,6,7};
        int min=list[0];
        int max=list[0];
        for (int i : list){
             if (i<min){
                 min=i;

             }
             if (i>max){
                 max=i;
             }
         }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maksimum Değer: " + max);
    }
}
