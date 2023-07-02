package callByRef;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person(25, "Rahul");

        Person person2 = person1;

        person2 = null;

        System.out.println(person1.age);

    }
}
