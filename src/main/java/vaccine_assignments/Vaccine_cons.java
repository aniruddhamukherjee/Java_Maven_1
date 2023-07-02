package vaccine_assignments;

import java.util.Scanner;
/* Write a Java program to develop a vaccine system.

    Step one : Create a Person class with following attributes -
    > Person name - String
    > Person age - int
    > Person aadhaar number - int
    > Getter and Setter methods for all above

    Step two : Create Vaccine class with main method and perform the following tasks -
    > Print "Please enter your name"
    Take name input from Console
    > Print "Please enter your aadhar number"
    Take aadhaar number input from Console
    > Print "Please enter your age"
    Take age input from Console
    > Check if aadhar number is 12 digit, if yes then nothing to do, else print "Addhar number is not in allowed format"
    > Check if age is more than 45. If yes, print "<Person_name> is eligible for first dose", else print "<Person_name> is not eligible for first dose"

    Hints:
    How to take input from Console?
    Check here : https://www.w3schools.com/java/java_user_input.asp 	*/

class Person_cons {

    private String personName;
    private int personAge;
    private long personAaadhaarNumber;

   /* public Person() {
         //set default value
        this.personAaadhaarNumber = 00000000;
    }*/

    public Person_cons(String personName, int personAge, long personAaadhaarNumber) {
        this.personName = personName;
        this.personAge = personAge;
        this.personAaadhaarNumber = personAaadhaarNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public long getPersonAaadhaarNumber() {
        return personAaadhaarNumber;
    }

    public void setPersonAaadhaarNumber(long personAaadhaarNumber) {
        this.personAaadhaarNumber = personAaadhaarNumber;
    }

    public boolean aadhaarValid() {

        int count = 0;
        while (this.personAaadhaarNumber > 0) {
            this.personAaadhaarNumber = this.personAaadhaarNumber / 10;
            count = count + 1;
        }
        if (count != 12)
            return false;
        else
            return true;

    }
}

public class Vaccine_cons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your Name");
        String name = sc.nextLine();


        System.out.println("Please enter Your Aaadhaar Number");
        long aadhaar = sc.nextLong();

        System.out.println("Please enter Your Age");
        int age = sc.nextInt();
        //Person_cons person = new Person_cons();  //default constructor
        //creating Person object
        Person_cons person = new Person_cons(name, age, aadhaar);

        //checking if aadhar valid
        boolean check = person.aadhaarValid();

        if (check == false) {
            System.out.println("Addhar number is not in allowed format");
        } else {
            if (age >= 45)
                System.out.println(name + "    " + "is eligible for first dose");
            else
                System.out.println(name + "    " + "is not eligible for first dose");
        }

    }


}


