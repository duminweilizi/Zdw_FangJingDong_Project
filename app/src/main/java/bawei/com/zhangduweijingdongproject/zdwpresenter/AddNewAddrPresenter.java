package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.AddNewAddrModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.AddNewAddrBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.AddNewAddrPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.AddNewAddrInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class AddNewAddrPresenter implements AddNewAddrPresenterInter {

    private AddNewAddrInter addNewAddrInter;
    private AddNewAddrModel addNewAddrModel;

    public AddNewAddrPresenter(AddNewAddrInter addNewAddrInter) {
        this.addNewAddrInter = addNewAddrInter;
        addNewAddrModel = new AddNewAddrModel(this);
    }

    public void addNewAddr(String addNewAddrUrl, String uid, String addr, String phone, String name) {

        addNewAddrModel.addNewAddr(addNewAddrUrl,uid,addr,phone,name);
    }

    @Override
    public void onAddAddrSuccess(AddNewAddrBean addNewAddrBean) {
        addNewAddrInter.onAddNewAddrSuccess(addNewAddrBean);
    }
}

