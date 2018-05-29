package bawei.com.zhangduweijingdongproject.zdwutils;


import java.util.Map;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.VideoBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

/**
 * Created by dell on 2018/5/22.
 */

public interface MyService {

    @GET("satinApi")
    Call<VideoBean> getvideodata(@QueryMap Map<String,String> map);
}
