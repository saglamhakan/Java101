import java.util.Arrays;
public class ArraysCopyOfandArraysCopyOfRange {
    public static void main(String[] args) {
        int[] list={1,3,5,2,8,-11};

       // int[] copylist=Arrays.copyOf(list,4);
        int[] copylist= Arrays.copyOfRange(list,1,4);
        System.out.println(Arrays.toString(copylist));

    }
}
