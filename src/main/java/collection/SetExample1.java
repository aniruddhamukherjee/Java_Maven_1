package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample1 {

  public static void main(String[] args) {

    List<Integer> numList = new ArrayList<>();

    numList.add(1);
    numList.add(1);
    numList.add(2);
    numList.add(2);
    numList.add(3);

    //System.out.println("List is : " + numList);

    HashSet<Integer> numSet = new HashSet<>();

    //numSet.addAll(numList);


    numSet.add(1);
    numSet.add(3);
    numSet.add(3);
    numSet.add(4);



    System.out.println("Set is : " + numSet);




  }
}
