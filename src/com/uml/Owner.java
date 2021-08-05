package com.uml;

public class Owner {
private String name;
private Date dateOfBirth;
private String nic;
public Owner() {
	System.out.println("Default Constructor");
}
public Owner(String name, String nic,Date dateOfBirth) {
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.nic = nic;
}

public Owner(Owner o) {
	this.name = o.name;
	this.dateOfBirth = o.dateOfBirth;
	this.nic = o.nic;
}
public void  input() {
	
}

public void Print() {
	System.out.println("name:"+name+" dateOfBirth:"+dateOfBirth+"year:"+nic);
}
@Override
public String toString() {
	return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nic=" + nic + "]";
}

}
