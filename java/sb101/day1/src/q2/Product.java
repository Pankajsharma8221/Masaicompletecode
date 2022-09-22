package q2;

public class Product {
private int productId;
private String productName;
private double prodcutPrice;
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
public double getProdcutPrice() {
	return prodcutPrice;
}
public void setProdcutPrice(double prodcutPrice) {
	this.prodcutPrice = prodcutPrice;
}
public Product(int productId, String productName, double prodcutPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.prodcutPrice = prodcutPrice;
}
public Product() {
	super();
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", prodcutPrice=" + prodcutPrice + "]";
}


}
