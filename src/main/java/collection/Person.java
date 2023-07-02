package collection;

public class Person {

  public Person(String a, int b){
    name = a;
    age = b;
  }
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString(){
    return ("Name=" + this.name + " age=" + this.age);
  }
}
