package string_builder_buffer_tokenizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String2 {
    public static void main(String[] args) {
        String s1 = "rahul Sarkar";

        String s2 = "aaa bbbb ccc dddd";

        List<String> list = new ArrayList<String>();

        list.add(s1);
        list.add(s2);

        System.out.println(s1.substring(0,5));
        System.out.println(s1.substring(6));

        System.out.println(s1.contains("abcd"));
        //System.out.println(String.join(",", s1, s2));
        System.out.println(String.join("---", list));


        String s3 = s1.replace('r', 'z');
        String s4 = s2.replace("aaa", "zzz");

        System.out.println("char replace  " + s3);
        System.out.println("pattern replace   " + s4);

        System.out.println("s1 ---   " + s1);

        String s5 = "Amit-Rahul-Payel-Roshni";

        String[] strArr = s5.split("-");

        //System.out.println(strArr);

        list = Arrays.stream(strArr).toList();

        System.out.println(list);


        String s6 = "     Rahul Sarkar        ";

        System.out.println(s6.trim());

        int num = 556;

        System.out.println(String.valueOf(num).charAt(2));

        StringBuilder sb = new StringBuilder(s1);

        sb.append(s2).reverse();

        System.out.println(sb);

    }

}
