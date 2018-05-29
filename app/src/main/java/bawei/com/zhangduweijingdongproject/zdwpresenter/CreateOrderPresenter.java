package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.CreateOrderModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.CreateOrderBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.CreateOrderPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.CreateOrderInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class CreateOrderPresenter implements CreateOrderPresenterInter {

    private CreateOrderInter createOrderInter;
    private CreateOrderModel createOrderModel;

    public CreateOrderPresenter(CreateOrderInter createOrderInter) {
        this.createOrderInter = createOrderInter;
        createOrderModel = new CreateOrderModel(this);
    }

    public void createOrder(String createOrderUrl, String uid, double price) {

        createOrderModel.createOrder(createOrderUrl,uid,price);

    }

    @Override
    public void onOrderCreateSuccess(CreateOrderBean createOrderBean) {
        createOrderInter.onCreateOrderSuccess(createOrderBean);
    }
}

