package io.shopping.orderdetails;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {
	
	@Autowired
	private OrderServices orderServices;
	
	@RequestMapping("/allorders")
	public List<OrderDetail> getAllOrdersDetails(){
		return orderServices.getAllordersDetail();
	}
	
	@RequestMapping("/allorders/{id}")
	public OrderDetail getOrderDetail(@PathVariable ObjectId id) {
		return orderServices.getOrderById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/allorders")
	public void createOrder(@RequestBody OrderDetail orderDetail) {
		
		orderServices.createOrder(orderDetail);
	}

}
