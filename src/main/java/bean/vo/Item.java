package bean.vo;


public class Item {
	private  int id;
	private int quantity;
	private GoodsVo goods;

	public  Item(){

	}
	public Item(GoodsVo g, int quantity,int id){
		this.goods=g;
		this.quantity=quantity;
		this.id=id;

	}
	public Item(GoodsVo g, int quantity){
		this.setGoods(g);
		this.setQuantity(quantity);


	}
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public GoodsVo getGoods() {
		return goods;
	}
	public void setGoods(GoodsVo goods) {
		this.goods = goods;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




}
