package q5;

public class Product {
private int productId;
private String productName;
private int qantity;
private int price;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQantity() {
	return qantity;
}
public void setQantity(int qantity) {
	this.qantity = qantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Product(int productId, String productName, int qantity, int price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.qantity = qantity;
	this.price = price;
}
public Product() {
	super();
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", qantity=" + qantity + ", price="
			+ price + "]";
}
}
