package bean.vo;

import java.util.List;

public class GoodsVo {
	Integer goodsId;
	String goodsName;
	Float price;
	List<Item> soldItems;

	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getSoldQuantity(){
		int rst=0;
		if(soldItems!=null&&soldItems.size()>0){
			for(Item oneItem:soldItems){
				rst+=oneItem.getQuantity();
			}
		}
		return rst;
	}
}
