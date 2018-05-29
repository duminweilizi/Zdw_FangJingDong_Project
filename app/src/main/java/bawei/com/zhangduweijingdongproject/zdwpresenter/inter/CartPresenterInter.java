package bawei.com.zhangduweijingdongproject.zdwpresenter.inter;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.CartBean;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */



public interface CartPresenterInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}
