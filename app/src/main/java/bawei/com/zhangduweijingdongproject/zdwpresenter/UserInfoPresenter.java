package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.UserInfoModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.UserInfoBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.UserInfoPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.UserInforInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class UserInfoPresenter implements UserInfoPresenterInter {

    private final UserInfoModel userInfoModel;
    private final UserInforInter userInforInter;

    public UserInfoPresenter(UserInforInter userInforInter) {
        this.userInforInter = userInforInter;
        userInfoModel = new UserInfoModel(this);
    }

    public void getUserInfo(String userInfoUrl, String uid) {

        userInfoModel.getUserInfo(userInfoUrl,uid);

    }

    @Override
    public void onUserInfoSUccess(UserInfoBean userInfoBean) {
        userInforInter.onUserInforSuccess(userInfoBean);
    }
}

