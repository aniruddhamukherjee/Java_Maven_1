package string_builder_buffer_tokenizer;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter word");
        String word = scannerObj.nextLine();

        int len = word.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = word.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' ||
                    currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels in the word = " + count);
    }
}
