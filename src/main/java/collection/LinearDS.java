package collection;

import java.util.*;

public class LinearDS {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Rahul1");  // delete





        myList.add("Rahul1");// delete




        myList.add("Rahul2");
        myList.add("Rahul3");




// sequential access
       /* for(String s : myList){
           System.out.println(s);
           myList.remove("Rahul1");
        }*/


        //random access
     //   System.out.println(myList.get(2));



        // myList.remove("Rahul");

        /*for(String s : myList){
           myList.remove(0);
         //   System.out.println(s);
        }*/

        Iterator<String> it = myList.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("Rahul1")) {
                it.remove();
            }
        }


        System.out.println(myList);

     /*   List<String> myList1 = new ArrayList<String>();
        myList1.add("Rahul");
        myList1.add("Ani");
        myList1.add("Rahul");


        Set<String> unique = new HashSet<String>();

        unique.addAll(myList1);

*/
        /*List<String> myList2 = new ArrayList<String>();
        myList.add("Rahul2");
        myList.add("Ani2");
        myList.add("Anil2");*/


        //boolean status = myList2.addAll(myList);

        //System.out.println(status);

       // System.out.println(unique);


        // myList.remove("Rahul");

        /*for(String s : myList){
           myList.remove(0);
         //   System.out.println(s);
        }*/

      /*  Iterator<String> it = myList.iterator();

        while(it.hasNext()){
            String s = it.next();
            if(s.equals("Rahul")){
                it.remove();
            }
            it.next();
            System.out.println(it.next());
        }*/

    }


}

