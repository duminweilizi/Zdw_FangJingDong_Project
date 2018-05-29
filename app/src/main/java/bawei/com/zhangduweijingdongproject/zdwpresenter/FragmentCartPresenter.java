package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.CartModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.CartBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.CartPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.FragmentCartInter;


/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class FragmentCartPresenter implements CartPresenterInter {

    private FragmentCartInter fragmentCartInter;
    private CartModel cartModel;

    public FragmentCartPresenter(FragmentCartInter fragmentCartInter) {
        this.fragmentCartInter = fragmentCartInter;

        cartModel = new CartModel(this);
    }

    public void getCartData(String selectCart, String uid) {

        cartModel.getCartData(selectCart,uid);

    }

    @Override
    public void getCartDataNull() {
        fragmentCartInter.getCartDataNull();
    }

    @Override
    public void getCartDataSuccess(CartBean cartBean) {
        fragmentCartInter.getCartDataSuccess(cartBean);
    }
}
