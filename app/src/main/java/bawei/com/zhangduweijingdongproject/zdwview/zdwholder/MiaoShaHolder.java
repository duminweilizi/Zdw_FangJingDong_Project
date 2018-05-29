package bawei.com.zhangduweijingdongproject.zdwview.zdwholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import bawei.com.zhangduweijingdongproject.R;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class MiaoShaHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public MiaoShaHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.miao_sha_image);

    }
}
