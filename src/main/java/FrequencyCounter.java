import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 3, 2, 5};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki elemanların frekansını hesapla
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Frekansları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(num + " => " + frequency);
        }
    }
}
