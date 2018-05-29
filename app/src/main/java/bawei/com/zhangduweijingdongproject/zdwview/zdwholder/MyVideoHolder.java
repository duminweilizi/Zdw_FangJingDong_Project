package bawei.com.zhangduweijingdongproject.zdwview.zdwholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import bawei.com.zhangduweijingdongproject.R;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class MyVideoHolder extends RecyclerView.ViewHolder {

   public JCVideoPlayerStandard jc_video;

    public MyVideoHolder(View itemView) {
        super(itemView);

        jc_video = itemView.findViewById(R.id.jcv_video);

    }
}
