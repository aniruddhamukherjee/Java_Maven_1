package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {


    static Map<String, String> map = new HashMap<String, String>();

    public static void main(String[] args) {
        map.put("1","One");
        map.put("2","Two");
        map.put("3","Three");

        map.put("4","Four");

        //System.out.println(map.get("3"));

        System.out.println("Map's internal entry set : "+ map.entrySet());

        for(Map.Entry<String, String> i : map.entrySet()){
            System.out.print("Key:" + i.getKey());

            System.out.println("  Value:" + i.getValue());

        }
    }

}
