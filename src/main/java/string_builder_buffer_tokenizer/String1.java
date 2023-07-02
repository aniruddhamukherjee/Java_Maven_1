package string_builder_buffer_tokenizer;

public class String1 {

    static String s1 = "Rahul";

    public static void main(String[] args) {
        System.out.println("Length :" + s1.length());

        String name="Rahul2";
        String sf1=String.format("name is %s abcd",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %f.2f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

        System.out.println(String.format("%.3f", 1.23456));
    }
}
