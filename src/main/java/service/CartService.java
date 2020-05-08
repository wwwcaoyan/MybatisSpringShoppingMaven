package service;

import bean.vo.Item;

import java.util.ArrayList;

public interface CartService {
    void addToCart(Integer goodsId, int quantity);
    void update(Integer goodsId, int quantity);
    void delete(Integer goodsId);
    ArrayList<Item> getCart();
    void setCart(ArrayList<Item> cart);

}