package collection;

import java.util.ArrayList;
import java.util.List;

class Employee {   //POJO
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
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

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
  }
}

public class EmployeeArrayList {
  public static void main(String[] args) {

    //interface     objname     =  new Concrete class name which implements interface
    List<Employee> employeeList = new ArrayList<Employee>();

    employeeList.add(new Employee(1, "John", 50000));
    employeeList.add(new Employee(2, "Mary", 60000));
    employeeList.add(new Employee(3, "Bob", 55000));

    for (Employee employee : employeeList) {
      System.out.println(employee);
    }
  }
}
