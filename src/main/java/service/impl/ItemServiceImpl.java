package service.impl;

import bean.vo.Item;
import dao.ItemDao;
import org.springframework.stereotype.Service;
import service.ItemService;

import javax.annotation.Resource;
import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
    @Resource(name="itemDao")
    ItemDao itemDao;

    @Override
    public Integer saveItem(Item newItem) {
        return itemDao.saveItem(newItem);
    }

    @Override
    public Integer modifyItem(Item modifiedItem) {
        return itemDao.modifyItem(modifiedItem);
    }

    @Override
    public List<Item> findNoIncludedItems() {
        return itemDao.findNoIncludedItems();
    }

    @Override
    public Item findItemById(Integer itemId) {
        return itemDao.findItemById(itemId);
    }

    @Override
    public Integer deleteItem(Integer ItemId) {
        return itemDao.deleteItem(ItemId);
    }

    @Override
    public Integer deleteItemsByIds(List<Integer> deletedItemsIds) {
        return itemDao.deleteItemsByIds(deletedItemsIds);
    }


}
