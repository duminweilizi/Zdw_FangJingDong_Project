package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.OrderListModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.OrderListBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.OrderListPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.FragmentOrderListInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class OrderListPresenter implements OrderListPresenterInter {

    private FragmentOrderListInter fragmentOrderListInter;
    private OrderListModel orderListModel;

    public OrderListPresenter(FragmentOrderListInter fragmentOrderListInter) {
        this.fragmentOrderListInter = fragmentOrderListInter;
        orderListModel = new OrderListModel(this);
    }

    public void getOrderData(String orderListUrl, String uid, int page) {

        orderListModel.getOrderData(orderListUrl,uid,page);

    }

    @Override
    public void onOrderDataSuccess(OrderListBean orderListBean) {

        fragmentOrderListInter.onOrderDataSuccess(orderListBean);
    }
}
