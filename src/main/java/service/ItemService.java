package service;

import bean.vo.Item;

import java.util.List;

public interface ItemService {
    Integer saveItem(Item newGoods);
    Integer modifyItem(Item modifiedGoods);
    List<Item> findNoIncludedItems();
    Item findItemById(Integer itemId);
    Integer deleteItem(Integer ItemId);
    Integer deleteItemsByIds(List<Integer> deletedItemdIds);
}
