package io.shopping.orderdetails;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class OrderDetail {
	
	@Id
	public ObjectId _id; 
	
	public String name;
	public String quantity;
	public String item;
	public double price;
	public double totalprice;
	
	public OrderDetail() {}
	
	public OrderDetail(ObjectId _id, String name, String quantity, String item, double price, double totalprice) {
		super();
		this._id = _id;
		this.name = name;
		this.quantity = quantity;
		this.item = item;
		this.price = price;
		this.totalprice = totalprice;
	}

	public String get_id() { return _id.toHexString(); }
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
}
