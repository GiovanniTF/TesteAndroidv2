package br.com.giovanni.testebank;

public class AdapterView {

    private String name;
    private int agency;
    private int bankAccount;
    private double balance;

    public AdapterView (String name, int agency, int bankAccount, double balance, String title, String description, String date, double value){
        this.name = name;
        this.agency = agency;
        this.bankAccount = bankAccount;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

