import java.util.Arrays;
public class ArraysBinarySearch {
    public static void main(String[] args) {
        //İndis numarasını verir
        int[] list ={-5,-15,45,98,112,-456};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.binarySearch(list,-5));

    }
}
