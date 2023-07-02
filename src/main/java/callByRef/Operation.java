package callByRef;

class Operation {
    static int data = 50;

    void change(int a) {
        a = a + 100; //changes will be in the local variable only
        System.out.println("In method : value =" + a);
    }

    public static void main(String args[]) {
        Operation op = new Operation();

        System.out.println("before change " + data);
        op.change(data);
        System.out.println("after change " + data);

    }
}