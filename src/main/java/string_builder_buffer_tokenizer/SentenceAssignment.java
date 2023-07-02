package string_builder_buffer_tokenizer;

import java.util.StringTokenizer;
/* Write a Java program to print the following in the console 🡪


    Original paragraph :
    On July 16,1969,the Apollo 11 spacecraft launched from the Kennedy Space Center in Florida.Its mission was to go where no human being had gone before—the moon!The crew consisted of Neil Armstrong,Michael Collins,and Buzz Aldrin.The spacecraft landed on the moon in the Sea of Tranquility, a basaltic flood plain,on July 20, 1969.

    Modified paragraph :
    On July 16, 1969, the Apollo 11 spacecraft launched from the Kennedy Space Center in Florida. Its mission was to go where no human being had gone before—the moon! The crew consisted of Neil Armstrong, Michael Collins, and Buzz Aldrin. The spacecraft landed on the moon in the Sea of Tranquility,  a basaltic flood plain, on July 20,  1969.

    Number of sentences in the paragraph : 4


    Rules:
    Take the original paragraph as a predefined String in program.
    Whenever there is a punctuation, there should be a space after that.
    Assumption – Valid punctuations : comma, full-stop, exclamation only.
*/
public class SentenceAssignment {
    public static void main(String[] args) {
        String sentence = "On July 16,1969,the Apollo 11 spacecraft " +
                "launched from the Kennedy Space Center in Florida." +
                "Its mission was to go where no human being had gone " +
                "before—the moon!The crew consisted of " +
                "Neil Armstrong,Michael Collins,and Buzz Aldrin." +
                "The spacecraft landed on the moon in the Sea of Tranquility," +
                "a basaltic flood plain,on July 20, 1969.New sentence.";

        String a = (sentence.replaceAll(",", ", "));
        String b = (a.replaceAll("!", "! "));
        String c = (b.replaceAll("\\.", ". "));

       System.out.println("printing output after inserting spaces -- \n" + c);

        int count = 0;
        StringTokenizer st2 = new StringTokenizer(sentence, "!\\.");
        System.out.println();
        System.out.println("No. of sentences = " + st2.countTokens());


       /* while (st2.hasMoreTokens()) {// Getting next tokens
            System.out.println(st2.nextToken());
        }*/


    }
}
