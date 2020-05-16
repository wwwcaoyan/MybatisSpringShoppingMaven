package bean.vo;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private Date createdTime;


    private List<Item>items;

    public Date getCreatedTime() {
        return createdTime;
    }

    public Integer getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreatedTime(Date createTime) {
        this.createdTime = createTime;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
}
