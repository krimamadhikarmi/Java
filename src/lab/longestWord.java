package lab;

public class longestWord {
    public static void main(String[] args) {
        String[] words = {"sun", "moon", "stars", "galaxy"};

        // Variable to store the longest word
        String longestWord = "";

        // Loop through each word in the array
        for (String word : words) {
            // Check if the current word is longer than the longestWord found so far
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}
