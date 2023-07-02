package string_builder_buffer_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {

        String s2 = "2+3-1*8/4/5/6+4";

        String s3 = "I am Abc";
        StringTokenizer st2 = new StringTokenizer(s2,"*-/+");

        //StringTokenizer st2 = new StringTokenizer(s3," ");


        System.out.println("No of tokens = " + st2.countTokens());

        while (st2.hasMoreTokens()) {// Getting next tokens
            System.out.println(st2.nextToken());
        }

     // System.out.println("  \" ");
    }

}

