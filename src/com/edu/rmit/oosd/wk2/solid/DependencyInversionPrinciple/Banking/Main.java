package com.edu.rmit.oosd.wk2.solid.DependencyInversionPrinciple.Banking;


/**
* @author Carl Karama
*/
public class Main {

    public static void main(String[] args) {

        BankingManager anz = new DebitCard();
        BankingManager westpac = new CreditCard();
        BankingManager commbank = new DebitCard();
        BankingManager nab = new CreditCard();

        anz.deposit(200);
        westpac.deposit(250);
        commbank.deposit(150);
        nab.deposit(300);

        BankingManager[] bankingManagers = {anz, westpac, commbank, nab};




    }
}
