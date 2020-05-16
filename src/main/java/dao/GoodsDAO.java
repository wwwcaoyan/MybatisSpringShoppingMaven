package dao;

import bean.vo.GoodsVo;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Repository("goodsDao")
public interface GoodsDAO {
    List<GoodsVo> getGoodsWithItems();
//    List<GoodsVo> getGoodsWithItems(Map map);
    GoodsVo getGoodsById(Integer goodsId);
    int getPageCount();
    Integer saveGoods(GoodsVo newGoods);
    Integer modifyGoods(GoodsVo modifiedGoods);
    Integer deleteGoods(Integer goodsId);
}
