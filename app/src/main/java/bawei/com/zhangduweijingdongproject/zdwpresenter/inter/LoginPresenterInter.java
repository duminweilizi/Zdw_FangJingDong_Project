package bawei.com.zhangduweijingdongproject.zdwpresenter.inter;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.LoginBean;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public interface LoginPresenterInter {

    void onSuccess(LoginBean loginBean);


    void onSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}
