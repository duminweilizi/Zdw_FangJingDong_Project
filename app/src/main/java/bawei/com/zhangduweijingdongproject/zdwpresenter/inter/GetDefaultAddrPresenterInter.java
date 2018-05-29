package bawei.com.zhangduweijingdongproject.zdwpresenter.inter;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.DefaultAddrBean;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public interface GetDefaultAddrPresenterInter {
    void onGetDefaultAddrSuccess(DefaultAddrBean defaultAddrBean);

    void onGetDefaultAddrEmpty();
}

