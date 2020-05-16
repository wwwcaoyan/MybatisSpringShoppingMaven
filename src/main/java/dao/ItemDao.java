package dao;

import bean.vo.GoodsVo;
import bean.vo.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("itemDao")
public interface ItemDao {
    Integer saveItem(Item newGoods);
    Integer modifyItem(Item modifiedGoods);
    List<Item> findNoIncludedItems();
    Integer modifyItem(GoodsVo modifiedGoods);
    Item findItemById(Integer itemId);
    Integer deleteItem(Integer ItemId);
    Integer deleteItemsByIds(List<Integer> ids);
}
