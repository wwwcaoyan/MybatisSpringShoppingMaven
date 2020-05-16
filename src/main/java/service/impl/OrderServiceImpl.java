package service.impl;

import bean.vo.Order;
import dao.OrderDao;
import org.springframework.stereotype.Service;
import service.ItemService;
import service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Resource(name="orderDao")
    OrderDao orderDao;//service调用另一个实体的操作，最好调用service层，不要直接调用dao层
    @Resource(name="itemService")
    ItemService itemService;
    @Override
    public Integer saveOrder(Order newOrder) {
        orderDao.saveOrder(newOrder);
        return  orderDao.saveOrderItems(newOrder);
    }

    @Override
    public List<Order> findAllOrders() {
        return orderDao.findAllOrders();
    }

    @Override
    public Integer deleteOrderById(Integer orderId) {

        //先获得需要删除的所有的items的IDs
        List<Integer> deletedItemsIds=orderDao.findAllNeededDeletedItemsIds(orderId);
        //删除order对应的item关联数据
        orderDao.deleteOrderItems(orderId);
        //删除items
        itemService.deleteItemsByIds(deletedItemsIds);
        //删除order
        return orderDao.deleteOrderById(orderId);
    }
}
