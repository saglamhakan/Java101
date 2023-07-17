import java.util.HashMap;
import java.util.Map;

public class RepeatedNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 3, 4, 7, 8, 8, 9, 10, 10};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            // Dizideki sayıların frekansını hesapla
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        // Frekansı 2 olan sayıları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println("Tekrar eden çift sayı: " + entry.getKey());
            }
        }
    }
}
