package oop;

class Bicycle {

    public static void main(String[] args) {
        // for Bicycle class
        Bicycle sportsBicycle = new Bicycle();  //object creation
        sportsBicycle.gear = 5;
        sportsBicycle.colour = "green";
        sportsBicycle.type = "Sports cycle";


        Bicycle touringBicycle = new Bicycle();
        touringBicycle.gear = 0;
        touringBicycle.colour = "red";
        touringBicycle.type = "Touring cycle";


        touringBicycle.gear = touringBicycle.gear + 2; // gear = 2

        sportsBicycle.gear = (touringBicycle.gear + 2); //gear = 2+2

        System.out.println("Touring cycle colour = " + touringBicycle.colour);
        System.out.println("Touring cycle gear = " + touringBicycle.gear);
        pedalling(touringBicycle);
        braking(touringBicycle);


        System.out.println("Sports cycle colour = " + sportsBicycle.colour);
        System.out.println("Sports cycle gear = " + sportsBicycle.gear);
        pedalling(sportsBicycle);
        braking(sportsBicycle);


    }

    // state or field
    int gear;
    String colour;

    String type;

    // behavior or method
    public static void braking(Bicycle bicycle) {
        System.out.println("Working of Braking in " + bicycle.type);

    }

    public static void pedalling(Bicycle bicycle) {

        System.out.println("Working of pedalling in " + bicycle.type);
    }

}
