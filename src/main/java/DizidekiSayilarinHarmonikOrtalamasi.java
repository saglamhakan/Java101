public class DizidekiSayilarinHarmonikOrtalamasi {
    public static void main(String[] args) {
        int[] list={1,2};
        double result=0;
        for (int i : list){
            result+=1.0/i;

        }
        System.out.println(list.length/result);
    }
}
