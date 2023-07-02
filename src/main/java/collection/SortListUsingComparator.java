package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1 {
  private String name;
  private int age;

  public Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

}

  public class SortListUsingComparator {

    public static void main(String[] args) {
      List<Person1> people = new ArrayList<Person1>();    //HAS - A Person1

      people.add(new Person1("Alice", 25));
      people.add(new Person1("Bob", 30));
      people.add(new Person1("Charlie", 20));

      // Sort by age using a comparator inner class
      Comparator<Person1> ageComparatorAsc = new Comparator<Person1>() {    //step 1   //ascending order
        @Override
        public int compare(Person1 p1, Person1 p2) {
          return p1.getAge() - p2.getAge();
        }
      };


      Comparator<Person1> ageComparatorDesc = new Comparator<Person1>() {    //step 1   //descending order
        @Override
        public int compare(Person1 p1, Person1 p2) {
          return p2.getAge() - p1.getAge();
        }
      };

      Comparator<Person1> nameComparatorAsc = new Comparator<Person1>() {    //step 1   //ascending order
        @Override
        public int compare(Person1 p1, Person1 p2) {
          return p1.getName().compareTo(p2.getName());
        }
      };

      // Collections.sort(people, ageComparatorAsc);    //step 2

     // Collections.sort(people, ageComparatorDesc);    //step 2

      Collections.sort(people, nameComparatorAsc);    //step 2



      // Print the sorted list
      for (Person1 person : people) {
        System.out.println(person.getName() + " (" + person.getAge() + ")");
      }
    }
  }

