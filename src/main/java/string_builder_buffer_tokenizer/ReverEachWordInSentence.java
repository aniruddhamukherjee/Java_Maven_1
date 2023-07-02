package string_builder_buffer_tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverEachWordInSentence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter paragraph");
    String paragraph = sc.nextLine();
    int length = paragraph.length();
    int count = 0;
    String reverse = " ";

    //this is test, sentence! hello.
    StringTokenizer st1 = new StringTokenizer(paragraph, " ");

    //System.out.println("Number of words : " + st1.countTokens());
    while (st1.hasMoreTokens()) {


      reverse = st1.nextToken();
      //System.out.println("111111 :"  + reverse);
      StringBuffer bf = new StringBuffer(reverse);

      System.out.print(bf.reverse() + "  ");
    }
  }
}
