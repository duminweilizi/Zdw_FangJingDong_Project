package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.GetAllAddrModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.GetAllAddrBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.GetAllAddrPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.GetAllAddrInter;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */



public class GetAllAddrPresenter implements GetAllAddrPresenterInter {

    private GetAllAddrInter getAllAddrInter;
    private GetAllAddrModel getAllAddrModel;

    public GetAllAddrPresenter(GetAllAddrInter getAllAddrInter) {
        this.getAllAddrInter = getAllAddrInter;
        getAllAddrModel = new GetAllAddrModel(this);
    }

    public void getAllAddr(String getAllAddrUrl, String uid) {
        getAllAddrModel.getAllAddr(getAllAddrUrl,uid);
    }

    @Override
    public void onGetAllAddrSuccess(GetAllAddrBean getAllAddrBean) {
        getAllAddrInter.onGetAllAddrSuccess(getAllAddrBean);
    }
}
