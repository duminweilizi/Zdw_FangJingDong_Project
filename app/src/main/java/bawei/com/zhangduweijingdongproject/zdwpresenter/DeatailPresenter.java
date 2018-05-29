package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.DeatilModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.DeatilBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.DeatilPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.DetailActivityInter;


/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class DeatailPresenter implements DeatilPresenterInter {

    private DeatilModel deatilModel;
    private DetailActivityInter detailActivityInter;

    public DeatailPresenter(DetailActivityInter detailActivityInter) {
        this.detailActivityInter = detailActivityInter;

        deatilModel = new DeatilModel(this);

    }

    public void getDetailData(String detailUrl, int pid) {

        deatilModel.getDetailData(detailUrl,pid);
    }

    @Override
    public void onSuccess(DeatilBean deatilBean) {
        //回调给view
        detailActivityInter.onSuccess(deatilBean);
    }
}

