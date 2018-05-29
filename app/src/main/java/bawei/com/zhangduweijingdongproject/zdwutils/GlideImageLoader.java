package bawei.com.zhangduweijingdongproject.zdwutils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {

        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        //Glide 加载图片简单用法
        Glide.with(context).load(path).into(imageView);

    }
}