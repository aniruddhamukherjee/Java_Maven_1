package string_builder_buffer_tokenizer;

public class StringManipulations {

    public static void main(String[] args) {


        String s1 = "ABCD1234";

        char c1 = 'A';


        String s2 = "I,am,Ani";

        String[] arr = s2.split(",");

       // arr  = {"I", "am", "Ani"}

        for(String each : arr){
            System.out.print(each + "  ");
        }

    }
}
