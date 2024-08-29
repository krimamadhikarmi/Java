package lab;

public class shortestWord {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cat", "orange"};

        // Initialize with the first word in the array
        String shortestWord = words[0];

        // Loop through each word in the array
        for (String word : words) {
            // Check if the current word is shorter than the shortestWord found so far
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("The shortest word is: " + shortestWord);
    }
}
