package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.RegistModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.RegistBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.RegistPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.RegistActivityInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class RegistPresenter implements RegistPresenterInter {

    private RegistActivityInter registActivityInter;
    private RegistModel registModel;

    public RegistPresenter(RegistActivityInter registActivityInter) {
        this.registActivityInter = registActivityInter;
        registModel = new RegistModel(this);
    }

    public void registUser(String registUrl, String name, String pwd) {

        registModel.registUser(registUrl,name,pwd);
    }

    @Override
    public void onRegistSuccess(RegistBean registBean) {
        registActivityInter.onRegistSuccess(registBean);
    }
}

