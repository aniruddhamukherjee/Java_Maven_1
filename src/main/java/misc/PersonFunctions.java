package misc;

 class Person2 {  //this is a POJO class

    public int getAge() {
        return age;
    }

    public void setAge(int x) {
        this.age = x;
    }

    private int age;
    public String name;


}

public class PersonFunctions {

    public static void main(String[] args) {

        Person2 person1 = new Person2(); // object created

        person1.name = "Malini";  //setting value of data members

        person1.setAge(30);


        System.out.println("Person1' name " + person1.name);   //getting values of data members
        System.out.println("Person1' age " + person1.getAge());


    }
}
