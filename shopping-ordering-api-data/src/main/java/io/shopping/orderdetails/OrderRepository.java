package io.shopping.orderdetails;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderDetail, String> {
	
	public OrderDetail findBy_id(ObjectId _id);
}
