package q1;

public class Product {
private int productId;
private String productName;
private double ProductPrice;
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
public double getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(double productPrice) {
	ProductPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", ProductPrice=" + ProductPrice + "]";
}
public Product(int productId, String productName, double productPrice) {

	this.productId = productId;
	this.productName = productName;
	this.ProductPrice = productPrice;
}




}
