package bawei.com.zhangduweijingdongproject.zdwview.zdwiview;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.FenLeiBean;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.HomeBean;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public interface InterFragmentHome {
    void onSuccess(HomeBean homeBean);

    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}

