package service;

import bean.vo.Item;

import java.util.ArrayList;
import java.util.List;

public interface CartService {
    public void addToCart(Integer goodsId, int quantity);
    public void update(Integer goodsId, int quantity);
    public void delete(Integer goodsId);
    public List<Item> getCart();
    public void setCart(List<Item> cart);
    public void clearCart(List<Item> cart);

}