package com.uml;

public class Date {
private int date;
private int month;
private int year;
public Date() {
	System.out.println("Default Constructor");
}
public Date(int date, int month, int year) {
	this.date = date;
	this.month = month;
	this.year = year;
}
public Date(Date d) {
	this.date=d.date;
	this.month=d.month;
	this.year=d.year;
}

public void  input() {
	System.out.println("Input data");
}

public void Print() {
	System.out.println("date:"+date+" month:"+month+"year:"+year);
}
@Override
public String toString() {
	return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
}

}
