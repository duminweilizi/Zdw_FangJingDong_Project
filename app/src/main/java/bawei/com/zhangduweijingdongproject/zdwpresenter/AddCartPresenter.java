package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.AddCartModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.AddCartBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.AddCartPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.ActivityAddCartInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class AddCartPresenter implements AddCartPresenterInter {

    private ActivityAddCartInter activityAddCartInter;
    private AddCartModel addCartModel;

    public AddCartPresenter(ActivityAddCartInter activityAddCartInter) {
        this.activityAddCartInter = activityAddCartInter;

        addCartModel = new AddCartModel(this);
    }

    public void addToCart(String addCart, String uid, int pid) {

        addCartModel.addToCart(addCart,uid,pid);

    }

    @Override
    public void onCartAddSuccess(AddCartBean addCartBean) {
        activityAddCartInter.onCartAddSuccess(addCartBean);
    }
}

