package service;

import bean.vo.Order;
import java.util.List;

public interface OrderService {
    Integer saveOrder(Order newOrder);
    List<Order> findAllOrders();
    Integer deleteOrderById(Integer OrderId);
}
