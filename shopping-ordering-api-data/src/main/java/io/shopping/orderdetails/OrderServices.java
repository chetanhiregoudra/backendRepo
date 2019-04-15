package io.shopping.orderdetails;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<OrderDetail> getAllordersDetail(){
		return orderRepository.findAll();
	}

	public OrderDetail getOrderById(ObjectId id) {
		
		return orderRepository.findBy_id(id);
	}

	public void createOrder(OrderDetail orderDetail) {
		
		orderDetail.set_id(ObjectId.get());
		orderRepository.save(orderDetail);
	}

}
