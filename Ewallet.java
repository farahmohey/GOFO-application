/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * It's a class with some methods that produces an online payment method which 
 * called EWallet, if the user either player or playground owner wants to check 
 * his balance also the player can transfer the amount of money needed from the 
 * playground owner by using the function transferBalance()
 *
 * @author Mariam and Farah
 */
public class Ewallet {

    private double money;

    /**
     * It's a method to return the amount of money (Balance)
     *
     * @return The balance in the EWallet
     */
    public double getBalance() {
        return money;
    }

    /**
     * It's a method to transfer the amount of money selected upon the player
     * books any playground
     *
     * @param m -The amount of money that must be transferred
     * @param pgowner -The playground owner that the money will be transferred
     * for him
     * @return True if transferred successfully
     */
    public boolean transferMoney(double m, PlaygroundOwner pgowner) {
        if (m < money) {
            money = money - m;
            pgowner.ewallet.money = pgowner.ewallet.money + m;
            return true;
        } else if (m > money) {
            System.out.println("Sorry, You don't have enough balance");
        }
        return false;
    }

    /**
     * Method to deposit money in the balance of the account
     *
     * @param m The amount of money that the client wants to deposit
     */
    public void depositMoney(double m) {
        money = money + m;
        System.out.println("Your new balance : " + money);
    }

    /**
     * Method to withdraw money from the balance of the account
     *
     * @param m The amount of money that the client wants to withdraw
     */
    public void withdrawMoney(double m) {
        if (m < money) {
            money = money - m;
            System.out.println("Your new balance : " + money);
        } else if (m > money) {
            System.out.println("Sorry, You don't have enough balance");
            System.out.println("Your balance is " + money);
        } else {
            System.out.println("Error!");
        }
    }
}
