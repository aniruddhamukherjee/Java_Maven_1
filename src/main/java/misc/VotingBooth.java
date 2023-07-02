package misc;

public class VotingBooth {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();


        p1.setAge(25);
        p2.setAge(17);

        if (p1.getAge() < 18) {
            System.out.println("P1 not eligible to vote");
        } else {
            System.out.println("P1 eligible to vote");
        }


        if (p2.getAge() < 18) {
            System.out.println("P2 not eligible to vote");
        } else {
            System.out.println("P2 eligible to vote");
        }

    }
}
