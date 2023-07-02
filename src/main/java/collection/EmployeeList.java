package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList implements Comparable<EmployeeList>{

    private int id;
    private String name;
    private int age;

    public EmployeeList(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(EmployeeList o) {
        // return this.id - o.id;
        return o.age - this.age;
    }

   /* public String toString() {
        return "Employee : " + id + " - " + name
                + " - " + age;
    }*/



    public static void main(String[] args) {
        EmployeeList e1 = new EmployeeList(1, "Anil", 27);
        EmployeeList e2 = new EmployeeList(2, "Pankaj", 23);
        EmployeeList e3 = new EmployeeList(3, "Reshmi", 28);

        List<EmployeeList> empList = new ArrayList<EmployeeList>();
        empList.add(e1);
        empList.add(e3);
        empList.add(e2);


        System.out.println("Before  sorting");

        System.out.println(empList);


        Collections.sort(empList);

        System.out.println("After default sorting");

        System.out.println(empList);

        //  System.out.println("After name sorting");
        // Collections.sort(empList, new FirstNameSorter());

        // System.out.println(empList);


        // key = id, value - name
        //  Map<Integer, String> result1 = empList.stream().collect(
        //   Collectors.toMap(Employee::getId, Employee::getName));

        // another syntax
        //Map<Integer, String> result3 = empList.stream().collect(
        //         Collectors.toMap(x -> x.getId(), x -> x.getName()));

        // System.out.println("After creating Map :");

        // System.out.println(result1);

    }

}
