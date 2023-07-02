package main.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    static HashMap<Integer, String> map1 = new HashMap<>();

    public static void main(String[] args) {

        map1.put(1,"One"); //ENTRY with key as "1" and value as "One"
        map1.put(2,"Two");  //ENTRY
        map1.put(3,"Three"); //ENTRY
        map1.put(4,"Four"); //ENTRY


       // map1.get("4");
        System.out.println(map1.get(4)); //ALWAYS FETCH BY KEY

        // Gives back set of ENTRIES where EACH ENTRY = (key,value) pair
       System.out.println("Map's internal entry set : "+ map1.entrySet());

    //  map :[ entry1, entry2, entry3, entry4....]

      for(Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.print("Key:" + entry.getKey());
            System.out.println("  Value:" + entry.getValue());
        }



        /*int arr[] = {1,2,3,4,5};

        for(int x: arr){
            System.out.println(x);
        }*/
    }

}
