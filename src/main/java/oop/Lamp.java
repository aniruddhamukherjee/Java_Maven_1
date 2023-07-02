package oop;

class Lamp {

    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    // method to turnoff the light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

class SwitchBoard {
    public static void main(String[] args) {




        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();


        SwitchBoard switchBoard1 = new SwitchBoard();

        for(int i=1 ; i<=5; i++) {
            switchBoard1.switchOn(led);
            //delay
            switchBoard1.switchOff(led);
        }

        // turn on the light by
        // calling method turnOn()
      //  System.out.println("LED lights....");
      //  led.turnOn();
        //led.turnOff();



        // turn off the light by
        // calling method turnOff()
       // System.out.println("Halogen lights...");
       // halogen.turnOn();
       // halogen.turnOff();



    }

    public void switchOn(Lamp obj){
      obj.turnOn();
    }

    public void switchOff(Lamp obj){
        obj.turnOff();
    }


}