package carassignment;

import java.util.Scanner;
 class Car {


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    private String company;
    private String modelName;
    private String colour;
    private int yearOfRegistration;

    public void accelerate() {
        System.out.println("Car accelerated for " + this.getCompany() + " " + this.getModelName());
    }

    public void brake() {
        System.out.println("Car brakes applied for " + this.company + "  " + this.modelName);
    }

    public void changeGear() {

        System.out.println("Gear changed for " + this.company + " " + this.modelName);
    }

    public void oldOrNew() {
        if (this.getYearOfRegistration() < 1970 || this.getYearOfRegistration() > 2022) {
            System.out.println("Invalid year of registration for " + this.modelName);
        } else if (this.getYearOfRegistration() < 2010) {
            System.out.println(this.modelName + " is an old car");
        } else {
            System.out.println(this.modelName + " is a new car");
        }
    }

}

public class MainCar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter car company");
        String company = sc.nextLine();

        System.out.println("Please enter car model");
        String model = sc.nextLine();

        System.out.println("Please enter car colour");
        String colour = sc.nextLine();

        System.out.println("Please enter car registration year - YYYY");
        int regYear = sc.nextInt();

        Car car1 = new Car();

        car1.setCompany(company);
        car1.setModelName(model);
        car1.setColour(colour);
        car1.setYearOfRegistration(regYear);

        System.out.println("Car1.....");
        car1.accelerate();
        car1.brake();
        car1.changeGear();
        car1.oldOrNew();

    }


}