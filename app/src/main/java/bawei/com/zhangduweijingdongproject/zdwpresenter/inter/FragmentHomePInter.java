package bawei.com.zhangduweijingdongproject.zdwpresenter.inter;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.FenLeiBean;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.HomeBean;


/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public interface FragmentHomePInter {
    //首页的数据
    void onSuccess(HomeBean homeBean);
    //分类
    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}