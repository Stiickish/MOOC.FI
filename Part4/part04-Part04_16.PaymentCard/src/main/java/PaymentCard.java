/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelon
 */
public class PaymentCard { //PaymentCard class

    private double balance; //private variabel of double named balance. Not initialized yet

    public PaymentCard(double openingBalance) { //Constructor of PaymentCard
        this.balance = openingBalance; //Balance is not initialized

    }

    public String toString() { //toString method. Returns balance
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        //If balance minus 2.60 is still bigger than 0, then do it
        //Balance cant be less than 0

        if (this.balance - 2.60 >= 0.0) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        //If balance minus 4.60 is bigger than 0, then do it. 
        //Balance cant be less than 0

        if (this.balance - 4.60 >= 0.0) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) { //addmoney method. takes a double amount in parameter
        if (amount > 0) { //If amount is bigger than 0
            if (this.balance + amount > 150) { //If balance + inpiut amount is bigger than 150
                this.balance = 150; //This balance is 150
            } else {
                this.balance = this.balance + amount; //If not, then this balance + that amount
            }
        }
    }
}
