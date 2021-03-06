package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.LoginModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.LoginBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.LoginPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.LoginActivityInter;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class LoginPresenter implements LoginPresenterInter {

    private LoginModel loginModel;
    private LoginActivityInter loginActivityInter;

    public LoginPresenter(LoginActivityInter loginActivityInter) {
        this.loginActivityInter = loginActivityInter;

        loginModel = new LoginModel(this);
    }
    //处理逻辑用的...判断
    public void getLogin(String loginUrl, String phone, String pwd) {

        loginModel.getLogin(loginUrl,phone,pwd);

    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        loginActivityInter.getLoginSuccess(loginBean);
    }

    @Override
    public void onSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl) {
        loginActivityInter.getLoginSuccessByQQ(loginBean,ni_cheng,iconurl);
    }

    public void getLoginByQQ(String phone, String pwd, String ni_cheng, String iconurl) {

        loginModel.getLoginByQQ(phone,pwd,ni_cheng,iconurl);

    }
}
