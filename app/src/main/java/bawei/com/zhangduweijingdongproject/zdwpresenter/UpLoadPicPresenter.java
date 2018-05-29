package bawei.com.zhangduweijingdongproject.zdwpresenter;

import java.io.File;

import bawei.com.zhangduweijingdongproject.zdwmodel.UpLoadPicModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.UpLoadPicBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.UpLoadPicPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.UpLoadActivityInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class UpLoadPicPresenter implements UpLoadPicPresenterInter {

    private UpLoadPicModel upLoadPicModel;
    private UpLoadActivityInter upLoadActivityInter;

    public UpLoadPicPresenter(UpLoadActivityInter upLoadActivityInter) {
        this.upLoadActivityInter = upLoadActivityInter;
        upLoadPicModel = new UpLoadPicModel(this);
    }

    public void uploadPic(String uploadIconUrl, File saveIconFile, String uid, String fileName) {

        upLoadPicModel.uploadPic(uploadIconUrl,saveIconFile,uid,fileName);

    }

    @Override
    public void uploadPicSuccess(UpLoadPicBean upLoadPicBean) {
        upLoadActivityInter.uploadPicSuccess(upLoadPicBean);
    }
}

