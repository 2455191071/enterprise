package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/20 15:32
 */

/**
 * @program: enterprise
 *
 * @description: 项目阶段类型维护
 *
 * @author: miss陆岳南
 *
 * @create: 2020-02-20 15:32
 **/
public class maintain {
    private int id;
    private String name;
    private int price;//内部值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
