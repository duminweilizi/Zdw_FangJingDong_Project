package bawei.com.zhangduweijingdongproject.zdwmodel.bean;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class CountPriceBean {
    private String priceString;
    private int count;

    public CountPriceBean(String priceString, int count) {
        this.priceString = priceString;
        this.count = count;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

