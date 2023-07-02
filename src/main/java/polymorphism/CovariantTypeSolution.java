package polymorphism;


class B1 {
  B1 foo() {
    return this;
  }

  void print() {
    System.out.println("Inside the class A1");
  }
}


// B2 is the child class of A1
class B2 extends B1 {
  @Override
  B2 foo() {
    return this;
  }

  void print() {
    System.out.println("Inside the class A2");
  }
}

// A3 is the child class of A2
class B3 extends B2 {
  @Override
  B3 foo() {
    return this;
  }

  @Override
  void print() {
    System.out.println("Inside the class A3");
  }
}

public class CovariantTypeSolution {

  // main method
  public static void main(String argvs[]) {
    B1 b1 = new B1();

    b1.foo().print();

    B2 b2 = new B2();

    b2.foo().print();

    B3 b3 = new B3();

    b3.foo().print();

  }
}