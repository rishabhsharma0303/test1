package com.uml;

public class SavingAccount extends Account{
private float interestRate;
public SavingAccount() {
	System.out.println("Default Constructor");
}
public SavingAccount(SavingAccount account) {
	super(account);
	this.interestRate=account.interestRate;
}
public void  input() {
	System.out.println("This is input ");
}

public void Print() {
	super.Print();
	System.out.println("interestRate:"+interestRate);
}
public float getInterest() {
	return super.getBalance()*interestRate;
}
@Override
public String toString() {
	return "SavingAccount [interestRate=" + interestRate + "]";
}

}
