package bawei.com.zhangduweijingdongproject.zdwview.zdwadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import bawei.com.zhangduweijingdongproject.R;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.VideoBean;
import bawei.com.zhangduweijingdongproject.zdwview.zdwholder.MyVideoHolder;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class MyVideoAdapter extends RecyclerView.Adapter<MyVideoHolder> {

    private Context context;
    private VideoBean videoBean;

    public MyVideoAdapter(Context context, VideoBean videoBean) {
        this.context = context;
        this.videoBean = videoBean;
    }

    @Override
    public MyVideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recvideo_item, parent, false);
        MyVideoHolder myVideoHolder = new MyVideoHolder(view);
        return myVideoHolder;
    }

    @Override
    public void onBindViewHolder(MyVideoHolder holder, int position) {

        String videouri = videoBean.getData().get(position).getVideouri();

        holder.jc_video.setUp(videouri,holder.jc_video.SCREEN_LAYOUT_NORMAL,videoBean.getData().get(position).getText());

        Glide.with(context).load(videoBean.getData().get(position).getBimageuri()) .into(holder.jc_video.thumbImageView);

    }

    @Override
    public int getItemCount() {
        return videoBean.getData().size();
    }
}
