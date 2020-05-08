package service.impl;

import bean.vo.GoodsVo;
import dao.GoodsDAO;
import org.springframework.stereotype.Service;
import service.GoodsService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Resource(name="goodsDao")
    GoodsDAO goodsDAO;
    @Override
    public List<GoodsVo> getGoodsByPage(int pageNo) {
        Map map=new HashMap();
        map.put("pageNo",pageNo);
        map.put("pageSize",2);
        return goodsDAO.getGoodsByPage(map);
    }

    @Override
    public GoodsVo getGoodsById(Integer goodsId) {
        return goodsDAO.getGoodsById(goodsId);
    }

    @Override
    public int getPageCount() {
        return goodsDAO.getPageCount();
    }

    @Override
    public Integer saveGoods(GoodsVo newGoods) {
        int rst = -1;
        rst = goodsDAO.saveGoods(newGoods);
        return rst;
    }

    @Override
    public Integer modifyGoods(GoodsVo modifiedGoods) {
        int rst = -1;
        rst = goodsDAO.modifyGoods(modifiedGoods);
        return rst;
    }

    @Override
    public Integer deleteGoods(Integer goodsId) {
        int rst = -1;
        rst = goodsDAO.deleteGoods(goodsId);
        return rst;
    }
}
