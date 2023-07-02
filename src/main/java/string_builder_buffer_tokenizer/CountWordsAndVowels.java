package string_builder_buffer_tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWordsAndVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter paragraph");
    String paragraph = sc.nextLine();
    int length = paragraph.length();
    int count = 0;

    //this is test, sentence! hello.

    StringTokenizer st1 = new StringTokenizer(paragraph, ",\\.! ");

    System.out.println("Number of words : " + st1.countTokens());
//////////////////////////////////////////////////////////////////////
    int countVowels = 0;
    for (int i = 0; i < paragraph.length(); i++) {
      char c = paragraph.charAt(i);
      if (c == 'a' || c == 'A' ||
          c == 'e' || c == 'E' ||
          c == 'i' || c == 'I' ||
          c == 'o' || c == 'O' ||
          c == 'u' || c == 'U') {
        countVowels++;
      }
    }

    System.out.println("Number of vowels = " + countVowels);


  }
}
