package bawei.com.zhangduweijingdongproject.zdwpresenter;

import android.content.Context;

import java.util.List;

import bawei.com.zhangduweijingdongproject.zdwmodel.GetProvinceModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.ProvinceBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.GetProvincePresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.GetProvinceInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class GetProvincePresenter implements GetProvincePresenterInter {

    private GetProvinceInter getProvinceInter;
    private GetProvinceModel getProvinceModel;

    public GetProvincePresenter(GetProvinceInter getProvinceInter) {
        this.getProvinceInter = getProvinceInter;
        getProvinceModel = new GetProvinceModel(this);
    }

    public void getProvince(Context context) {
        getProvinceModel.getProvince(context);
    }

    @Override
    public void onGetProvince(List<ProvinceBean> list) {
        getProvinceInter.onGetProvince(list);
    }
}
