package logical.operations;

import java.util.Scanner;

/* Check ward number before Voting */

 class Person { //POJO - plain old java object
    private String name;
    private int age;
    private String gender;
    private int wardNumber;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public boolean checkAge(){

        if(this.gender.equals("male")){
            if(this.age >= 19){
                return true;
            }
        }
        else{
            if(this.age >= 18){
                return true;
            }
        }

        return false;
    }
}

public class Voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your gender");
        String gender = sc.nextLine();

        System.out.println("Enter your ward number");
        int ward = sc.nextInt();

        Person person1 = new Person();

        person1.setName(name);
        person1.setAge(age);
        person1.setGender(gender);
        person1.setWardNumber(ward);

        boolean check = person1.checkAge();






    }
}
