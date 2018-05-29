package bawei.com.zhangduweijingdongproject.zdwview.zdwiview;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.CartBean;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public interface FragmentCartInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}
