package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.GetDefaultAddrModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.DefaultAddrBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.GetDefaultAddrPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.DefaultAddrInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class GetDefaultAddrPresenter implements GetDefaultAddrPresenterInter {

    private DefaultAddrInter defaultAddrInter;
    private GetDefaultAddrModel getDefaultAddrModel;

    public GetDefaultAddrPresenter(DefaultAddrInter defaultAddrInter) {
        this.defaultAddrInter = defaultAddrInter;
        getDefaultAddrModel = new GetDefaultAddrModel(this);
    }

    public void getDefaultAddr(String getDefaultAddrUrl, String uid) {
        getDefaultAddrModel.getDefaultAddr(getDefaultAddrUrl,uid);
    }

    @Override
    public void onGetDefaultAddrSuccess(DefaultAddrBean defaultAddrBean) {
        defaultAddrInter.onGetDefaultAddrSuccess(defaultAddrBean);
    }

    @Override
    public void onGetDefaultAddrEmpty() {
        defaultAddrInter.onGetDefaultAddrEmpty();
    }
}
