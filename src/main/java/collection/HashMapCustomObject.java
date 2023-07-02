package main.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Transaction {
  private double deposit;
  private double withdrawl;
  private String status;  //success .... failure

  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public double getWithdrawl() {
    return withdrawl;
  }

  public void setWithdrawl(double withdrawl) {
    this.withdrawl = withdrawl;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Deposit=" + this.deposit + " Withdrawl=" + this.withdrawl
        + " Transaction status=" + this.status;
  }

 /* @Override
  public String toString() {
    return "xyz";
  }*/
}

public class HashMapCustomObject {

  //key = acc number - value = Transaction
  static HashMap<Integer, Transaction> transactionHistoryOfICICI = new HashMap<>();

  public static void main(String[] args) {

    // transactionMap.put(account num integer, transaction object);

    Transaction transaction1 = new Transaction();
    transaction1.setDeposit(5000);
    transaction1.setStatus("success");

    Transaction transaction2 = new Transaction();
    transaction2.setDeposit(4000);
    transaction2.setStatus("success");

    Transaction transaction3 = new Transaction();
    transaction3.setDeposit(6000);
    transaction3.setStatus("failure");

    Transaction transaction4 = new Transaction();  // THIS MEANS "PRINT BANK STATEMENT" case
    transaction4.setDeposit(0);  // NEITHER DEPOSIT NOR WITDRAWL
    transaction4.setStatus("success");

    transactionHistoryOfICICI.put(12345, transaction2); //means acc number 12345 had a succesfull withdrawl of 4000
    transactionHistoryOfICICI.put(45678, transaction1);
    transactionHistoryOfICICI.put(45632, transaction3);
    transactionHistoryOfICICI.put(55555, transaction4);


    Transaction resultObj = transactionHistoryOfICICI.get(45678);

     /* System.out.println("Transaction of account num 45678 : " + "Deposit=" + resultObj.getDeposit() +
          " Withdrawl=" + resultObj.getWithdrawl()
          + " Transaction status=" + resultObj.getStatus());*/

    System.out.println("Transaction of account num 45678 : " +
        transactionHistoryOfICICI.get(45678));

    for (Map.Entry<Integer, Transaction> eachEntry : transactionHistoryOfICICI.entrySet()) {
      System.out.println(eachEntry.getKey() + "   " + eachEntry.getValue());
    }


    ///////////////////////////////////////
    //find for a given acc, find withdraw or deposit happened?

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter acc number :");

    Integer accNum = sc.nextInt();

    Transaction t = transactionHistoryOfICICI.get(accNum); //RETURNS NULL IF NO KEY VALUE FOUND

    if (t != null) {
      if ("success".equalsIgnoreCase(t.getStatus())) {
        if (t.getDeposit() > 0) {
          System.out.println("Deposit happened for " + accNum + " amount was " + t.getDeposit());
        } else if (t.getWithdrawl() > 0) {
          System.out.println(
              "Withdrawl happened for " + accNum + " amount was " + t.getWithdrawl());
        } else {
          System.out.println("Niether deposit nor withdrawl happened for " + accNum);
        }
      } else {
        System.out.println("No successful transaction found for accNum " + accNum);
      }

    } else {
      System.out.println("No transaction found for accNum " + accNum);
    }


  }
}
