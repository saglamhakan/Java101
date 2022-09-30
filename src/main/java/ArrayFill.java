import java.util.Arrays;
public class ArrayFill {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};

        Arrays.fill(list, 1, 3, 6);
        System.out.println(Arrays.toString(list));
    }
}
