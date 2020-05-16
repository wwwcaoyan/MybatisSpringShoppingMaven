package dao;

import bean.vo.GoodsVo;
import bean.vo.Item;
import bean.vo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderDao")
public interface OrderDao {
    Integer saveOrder(Order newOrder);
    Integer saveOrderItems(Order newOrder);
    List<Order> findAllOrders();
    List<Integer> findAllNeededDeletedItemsIds(Integer OrderId);
    Integer deleteOrderById(Integer OrderId);
    Integer deleteOrderItems(Integer OrderId);

}
