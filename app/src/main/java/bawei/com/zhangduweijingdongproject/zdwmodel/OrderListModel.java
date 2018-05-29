package bawei.com.zhangduweijingdongproject.zdwmodel;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.OrderListBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.OrderListPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwutils.CommonUtils;
import bawei.com.zhangduweijingdongproject.zdwutils.OkHttp3Util_03;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class OrderListModel {
    private OrderListPresenterInter orderListPresenterInter;

    public OrderListModel(OrderListPresenterInter orderListPresenterInter) {
        this.orderListPresenterInter = orderListPresenterInter;
    }

    public void getOrderData(String orderListUrl, String uid, int page) {

        Map<String, String> params = new HashMap<>();
        params.put("uid",uid);
        params.put("page", String.valueOf(page));

        OkHttp3Util_03.doPost(orderListUrl, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {

                    String json = response.body().string();

                    final OrderListBean orderListBean = new Gson().fromJson(json,OrderListBean.class);
                    CommonUtils.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
                            orderListPresenterInter.onOrderDataSuccess(orderListBean);
                        }
                    });

                }
            }
        });

    }
}
