package string_builder_buffer_tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceCount {
    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
/*
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        System.out.println("Number of vowels in the given sentence is " + count);*/

        StringTokenizer st2 = new StringTokenizer(sentence," ,\\.!");

        /*while (st2.hasMoreTokens()) {// Getting next tokens
            System.out.prntln(st2.nextToken());
        }*/


        System.out.println("Number of words in the given sentence is " + st2.countTokens());
    }
}