package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.FragmentHomeModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.FenLeiBean;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.HomeBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.FragmentHomePInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.InterFragmentHome;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class FragmentHomeP implements FragmentHomePInter {

    private FragmentHomeModel fragmentHomeModel;
    private InterFragmentHome interFragmentHome;

    //创建构造方法
    public FragmentHomeP(InterFragmentHome interFragmentHome) {
        this.interFragmentHome = interFragmentHome;

        //创建model的引用
        fragmentHomeModel = new FragmentHomeModel(this);
    }

    public void getNetData(String homeUrl) {

        //让model获取数据
        fragmentHomeModel.getData(homeUrl);

    }

    @Override
    public void onSuccess(HomeBean homeBean) {

        //此时的数据回调到p层,,,把数据从p层传到view层进行使用
        interFragmentHome.onSuccess(homeBean);
    }

    @Override
    public void onFenLeiDataSuccess(FenLeiBean fenLeiBean) {
        interFragmentHome.onFenLeiDataSuccess(fenLeiBean);
    }

    public void getFenLeiData(String fenLeiUrl) {

        fragmentHomeModel.getFenLeiData(fenLeiUrl);
    }
}

