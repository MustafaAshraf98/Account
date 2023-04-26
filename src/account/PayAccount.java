/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;


public class PayAccount {
    private int accountNo;
    private String name;
    private float amount = 100;
    
    public void insert(int a, String n, float amt){
//        System.out.println("Account number: "+ accountNo);
//        System.out.println("Account Name: "+ name);
//        System.out.println("Account amount: "+ amount);
        this.accountNo= a;
        this.name= n;
        this.amount =amt;
    }
    public void deposit(float amt){
        this.amount +=amt;
        System.out.println(amt + " deposited");
        System.out.println("Total Amount= "+ amount);
    }
    public void withdraw (float amt){
        if(amt> amount)
            System.out.println("Error!!");
        else{
            this.amount -= amt;
            System.out.println(amt + " withdrawn");
            System.out.println("Current Amount= "+ this.amount);
        }
    }
    public void checkBalance(){
        System.out.println("Your Amount= "+ amount);
    }
//    @Override
    public String toString(){
        return "Amount{ accountNo: "+accountNo + ", Name: "+ name+ ", Amount: "+ amount;
    }
}
