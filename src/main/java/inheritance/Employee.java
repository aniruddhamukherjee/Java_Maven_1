package inheritance;

public class Employee {

    int id;
    String name;
    Address address;  //HAS-A

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("gzb", "UP", "india");
        Employee e1 = new Employee(111, "varun", address1);


        Address address2 = new Address("kol", "WB", "india");
        Employee e2 = new Employee(112, "arun", address2);

        e1.display();
        e2.display();

    }
}

