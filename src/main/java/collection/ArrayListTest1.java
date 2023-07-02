package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest1 {

  public static void main(String[] args) {

    List<Integer> numList = new ArrayList<Integer>();

    List numList1 = new ArrayList();

    numList1.add("Hi");
    numList1.add(2);


    boolean status = numList.add(1); //index 0

    numList.add(2);   //index 1
    numList.add(4);  //index 2

    // [1    2     4]

    //numList.add("hi");

    System.out.println("Before--" + numList);

    numList.add(2, 3);

    //[ 1   2   3  4  100]

    numList.add(4, 100);
    System.out.println("inserting at random index ----- " + numList);

    System.out.println("Size of numlist ==>" + numList.size());

    System.out.println("After--" + numList);
    System.out.println(status);

    Object arr[] = numList.toArray();
    System.out.println(arr[0]);

    List<String> textList = new ArrayList<>();

    textList.add("Anil"); //0
    textList.add("Anil");  //1
    textList.add("Sunil"); //2
    textList.add("Malini"); //3


    //lexicographical sorting

    System.out.println("**** textList*** " + textList);

    Collections.sort(textList); //default sorting

    System.out.println("**** textList after sorting*** " + textList);


    //------------------------------------------------

    List<Person> persons = new ArrayList<>();

    persons.add(new Person("Anil", 23));
    persons.add(new Person("Sunil", 34));
    persons.add(new Person("Malini", 25));

    for(Person p : persons){
      System.out.println("Name=" + p.getName() + " age=" + p.getAge());
    }

    //System.out.println(persons);  //if toString( ) is implemented




  }
}
