import java.util.*;
import java.lang.*;
class MyBank {
    private double balance;
    MyBank(double balance){
        this.balance = balance;
    }
    public synchronized void deposit(double amount)
    {
        if(amount <= 0){
            System.out.println("Invalid amount..");
            return;
        }else{
            balance = balance + amount;
            System.out.println("Deposited ammount:" + amount + " New balance:- " + balance);
        }
    }
    public synchronized void withdraw (double amount) {
        if(balance >= amount){
            balance -=amount;
            System.out.println("withdraw amount:" + amount + " New balance:- " + balance);
        }else{
            System.out.println("Invalid amount..");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class MyTransaction extends Thread{
    private MyBank account;
    private double amount ;
    private boolean flag ;
    public MyTransaction (MyBank account, double amount, boolean flag){
        this.account =  account;
        this.amount = amount;
        this.flag = flag;
    }

    public void run(){
        if(flag){
            account.deposit(amount);
        }
        else{
            account.withdraw(amount);
        }
    }
}

class Bank{
    public static void main(String[] args) throws Exception{
        MyBank account = new MyBank(1000);
        MyTransaction depositThread=new MyTransaction(account,500,true);    
        MyTransaction withdrawThread=new MyTransaction(account,200,false);
        depositThread.start();
        withdrawThread.start();
        depositThread.join();
        withdrawThread.join();
        System.out.println("Final balance: " + account.getBalance());
    }
}
