package collection;

import java.util.ArrayList;
import java.util.Collections;

 class Employee1 implements Comparable<Employee1> {
  private int id;
  private String name;
  private double salary;

  public Employee1(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

 /* @Override
  public int compareTo(Employee1 otherEmployee) {
    return Double.compare(this.salary, otherEmployee.salary);
  }
*/
   /*@Override
   public int compareTo(Employee1 otherEmployee) {
     return Double.compare( otherEmployee.salary, this.salary);
   }*/

   @Override
   public int compareTo(Employee1 otherEmployee) {  //sort by salary, then id

     int result;

     if(Double.compare(this.salary, otherEmployee.salary) == 0){ //means equal salary
       result = Double.compare(this.id, otherEmployee.id);  //compare ids
     }
     else{
       result = Double.compare(this.salary, otherEmployee.salary);
     }

     return result;
   }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
  }
}

public class ArrayListSort2 {
  public static void main(String[] args) {
    ArrayList<Employee1> employees = new ArrayList<>();

    employees.add(new Employee1(3, "John", 50000));
    employees.add(new Employee1(5, "Mary", 51000));
    employees.add(new Employee1(1, "Bob", 50000));
    employees.add(new Employee1(4, "Jenny", 40000));
    employees.add(new Employee1(2, "Jane", 55000));
    employees.add(new Employee1(2, "Anita", 55000));
    employees.add(new Employee1(2, "Bobby", 75000));

    //output - jenny bob john mary anita jane bobby

    System.out.println("Before sorting: " + employees);

    Collections.sort(employees);

    System.out.println("After sorting: " + employees);
  }
}
