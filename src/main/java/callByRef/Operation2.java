package callByRef;

import java.util.ArrayList;
import java.util.List;

class Operation2 {
    int data = 50;

    void change(Operation2 op2) {
        op2.data = op2.data + 100;//changes will be in the instance variable
        System.out.println("inside method value = " + op2.data);
    }

    static void addName(List<String> a, String name){
        a.add(name);
    }

    public static void main(String args[]) {
        Operation2 op = new Operation2();

        System.out.println("before change " + op.data);
        op.change(op);//passing object
        System.out.println("after change " + op.data);


        List<String> names = new ArrayList<>();
        names.add("Rahul");

        addName(names, "Ani");


    }
}
