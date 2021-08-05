package com.MerchandiseInventoryTest;

public class Merchandise {
String itemCode;
int quantity;
Double unitPrice;
public Merchandise(String itemCode, int quantity, Double unitPrice) {

	this.itemCode = itemCode;
	this.quantity = quantity;
	this.unitPrice = unitPrice;
}
public String getItemCode() {
	return itemCode;
}
public void setItemCode(String itemCode) {
	this.itemCode = itemCode;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(Double unitPrice) {
	this.unitPrice = unitPrice;
}


}

