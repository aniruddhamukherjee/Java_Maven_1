package interface_abstractclass;

public class Dog implements Animal{
  @Override
  public void walk() {
    System.out.println("walking with four legs");

    System.out.println("see with " + numberOfeyes + " eyes");

  }

  @Override
  public void sound() {
    System.out.println("dog barks");
  }
}
