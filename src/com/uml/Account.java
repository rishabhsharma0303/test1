package com.uml;

public class Account {
private Owner owner;
private float balance;
private String number;
public Account() {
	System.out.println("Default Constructor");
}
public Account(Owner owner, float balance, String number) {
	this.owner = owner;
	this.balance = balance;
	this.number = number;
}
public Account(Account account) {
	this.owner = account.owner;
	this.balance = account.balance;
	this.number = account.number;
}
public void  input() {
	System.out.println("Enter the input");
}

public void Print() {
	System.out.println("owner:"+owner+" balance:"+balance+"number:"+number);
}
@Override
public String toString() {
	return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
}
public void deposit() {
	System.out.println("Amount deposited");
}

public void withDraw() {
	System.out.println("Amount WirhDrawed");
}
public float getBalance() {
	return balance;
}
}
