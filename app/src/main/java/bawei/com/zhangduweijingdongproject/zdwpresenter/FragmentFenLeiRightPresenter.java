package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.FragmentFenLeiRightModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.ChildFenLeiBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.FenLeiRightPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.FenLeiRightInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class FragmentFenLeiRightPresenter implements FenLeiRightPresenterInter {

    private FenLeiRightInter fenLeiRightInter;
    private FragmentFenLeiRightModel fragmentFenLeiRightModel;

    public FragmentFenLeiRightPresenter(FenLeiRightInter fenLeiRightInter) {
        this.fenLeiRightInter = fenLeiRightInter;

        fragmentFenLeiRightModel = new FragmentFenLeiRightModel(this);
    }

    public void getChildData(String childFenLeiUrl, int cid) {

        fragmentFenLeiRightModel.getChildData(childFenLeiUrl,cid);
    }

    @Override
    public void onSuncess(ChildFenLeiBean childFenLeiBean) {

        fenLeiRightInter.getSuccessChildData(childFenLeiBean);

    }
}
