package string_builder_buffer_tokenizer;

public class CountChars {

    public static void main(String[] args) {
        String s1= "this is my sentence 1234    who are ";
        int count = 0;
        for (int i= 0 ; i< s1.length(); i++)
        {
            if(s1.charAt(i)!= ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
