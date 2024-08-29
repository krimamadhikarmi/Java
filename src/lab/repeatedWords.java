package lab;
import java.util.ArrayList;
import java.util.List;

public class repeatedWords {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c", "a", "a", "d", "c", "f"};

        // Task 1: Find Repeated Words
        List<String> repeatedWords = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && !repeatedWords.contains(str[i])) {
                    repeatedWords.add(str[i]);
                    break;
                }
            }
        }
        System.out.println("Repeated words: " + repeatedWords);

        // Task 2: Display Non-Repeated Words
        List<String> nonRepeatedWords = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < str.length; j++) {
                if (i != j && str[i].equals(str[j])) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                nonRepeatedWords.add(str[i]);
            }
        }
        System.out.println("Non-repeated words: " + nonRepeatedWords);

        // Task 3: Remove All Repeated Words
        List<String> noRepeatedWords = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < str.length; j++) {
                if (i != j && str[i].equals(str[j])) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                noRepeatedWords.add(str[i]);
            }
        }
        System.out.println("Array after removing all repeated words: " + noRepeatedWords);
    }
}
