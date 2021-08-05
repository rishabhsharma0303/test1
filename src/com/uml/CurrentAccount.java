package com.uml;

public class CurrentAccount extends Account {
	private float minBalance;
	public CurrentAccount() {
		System.out.println("Default Constructor");
	}
	public CurrentAccount(CurrentAccount account) {
		super(account);
		this.minBalance=account.minBalance;
	}
	public void  input() {
		
	}

	public void Print() {
		super.Print();
		System.out.println("minBalance:"+minBalance);
	}
	public float getCharges() {
		return super.getBalance();
	}
	@Override
	public String toString() {
		return "CurrentAccount [minBalance=" + minBalance + "]";
	}
}
