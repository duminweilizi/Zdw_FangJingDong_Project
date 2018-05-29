package bawei.com.zhangduweijingdongproject.zdwview.zdwiview;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.LoginBean;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public interface LoginActivityInter {

    void getLoginSuccess(LoginBean loginBean);


    void getLoginSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}