package bawei.com.zhangduweijingdongproject.zdwmodel.bean;

import java.io.Serializable;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class ProvinceBean implements Serializable {
    private int regionid;
    private String name;

    public ProvinceBean(int regionid, String name) {
        this.regionid = regionid;
        this.name = name;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
