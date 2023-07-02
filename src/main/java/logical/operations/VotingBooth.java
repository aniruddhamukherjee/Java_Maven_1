package logical.operations;

import java.util.Scanner;

public class VotingBooth {


    public static void castVote(Voter voter) {
        if (voter.getGender().equalsIgnoreCase("M")) {
            if (voter.getAge() >= 18) {
                System.out.println("Yes, you can vote!!");
            } else {
                System.out.println("Sorry, age not enough to vote!!");
            }
        } else if (voter.getGender().equalsIgnoreCase("F")) {
            if (voter.getAge() >= 19) {
                System.out.println("Yes, you can vote!!");
            } else {
                System.out.println("Sorry, age not enough to vote!!");
            }
        } else {
            System.out.println("Please enter valid gender");
        }

    }

    public static void main(String[] args) {
        char choice = 'Y';
        String gender = null;
        Integer age = null;
        String temp = null;

        do {
            Scanner myObj = new Scanner(System.in);

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Welcome to voting booth....");

            System.out.println("Please enter your gender");
            gender = myObj.nextLine();

            System.out.println("Please enter your age");
            age = myObj.nextInt();

            Voter voter = new Voter(gender, age);

            castVote(voter);

            System.out.println("Do you want to continue? Please enter Y or N");
            temp = myObj2.nextLine();

            choice = temp.charAt(0);
        }
        while (choice != 'N');
        System.out.println("Thanks for voting, bye!!");

    }
}
