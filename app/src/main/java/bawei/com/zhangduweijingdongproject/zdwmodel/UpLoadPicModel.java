package bawei.com.zhangduweijingdongproject.zdwmodel;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bawei.com.zhangduweijingdongproject.zdwmodel.bean.UpLoadPicBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.UpLoadPicPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwutils.CommonUtils;
import bawei.com.zhangduweijingdongproject.zdwutils.OkHttp3Util_03;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class UpLoadPicModel {

    private UpLoadPicPresenterInter upLoadPicPresenterInter;

    public UpLoadPicModel(UpLoadPicPresenterInter upLoadPicPresenterInter) {
        this.upLoadPicPresenterInter = upLoadPicPresenterInter;
    }

    /**
     * 上传图片
     * @param uploadIconUrl
     * @param saveIconFile
     * @param uid
     * @param fileName
     */
    public void uploadPic(String uploadIconUrl, File saveIconFile, String uid, String fileName) {

        //String url, File file, String fileName,Map<String,String> params,Callback callback
        //上传的服务器的路径,,,上传的文件对象,,,上传成功之后服务器上图片的名字
        //params是存放传递的参数,,,,callback回调

        Map<String, String> params = new HashMap<>();
        params.put("uid",uid);

        OkHttp3Util_03.uploadFile(uploadIconUrl, saveIconFile, fileName, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {

                    String json = response.body().string();

                    final UpLoadPicBean upLoadPicBean = new Gson().fromJson(json,UpLoadPicBean.class);

                    CommonUtils.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
                            upLoadPicPresenterInter.uploadPicSuccess(upLoadPicBean);
                        }
                    });

                }
            }
        });

    }
}

