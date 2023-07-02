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

class Person2 {

    String name;
    int age;
    long aadhaar;

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

    public long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }
}

public class Vaccine2 {

    public static void main(String[] args) {

        Person2 person = new Person2();

        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Please enter your name");
        String name = scannerObj.nextLine();  // Read user input
        person.setName(name);

        // Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your aadhar number");
        long aadhaar = scannerObj.nextLong();  // Read user input
        person.setAadhaar(aadhaar);


        int digitsCount = countDigits(person.getAadhaar());
        if (digitsCount != 12) {
            System.out.println("Aadhar number is not in allowed format");
        } else {
            Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please enter your age");
            int age = scannerObj.nextInt();  // Read user input
            person.setAge(age);
            if (person.getAge() >= 45) {
                System.out.println(name + " is eligible for first dose");
            } else {
                System.out.println(name + " is NOT eligible for first dose");

            }
        }
    }

    public static int countDigits(long num) {
        int count = 0;
        while (num != 0) {
            // num = num/10
            num = num / 10;
            ++count;
        }
        return count;
    }

}
