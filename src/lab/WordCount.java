package lab;

public class WordCount {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueWordCount = 0;

        for (String word : words) {
            int index = findIndex(uniqueWords, word, uniqueWordCount);
            if (index != -1) {
                counts[index]++;
            } else {
                uniqueWords[uniqueWordCount] = word;
                counts[uniqueWordCount] = 1;
                uniqueWordCount++;
            }
        }
        for (int i = 0; i < uniqueWordCount; i++) {
            System.out.println(uniqueWords[i] + ": " + counts[i]);
        }
    }

    private static int findIndex(String[] uniqueWords, String word, int uniqueWordCount) {
        for (int i = 0; i < uniqueWordCount; i++) {
            if (uniqueWords[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}
