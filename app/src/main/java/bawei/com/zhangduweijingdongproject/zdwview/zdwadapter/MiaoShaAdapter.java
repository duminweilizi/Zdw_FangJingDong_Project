package bawei.com.zhangduweijingdongproject.zdwview.zdwadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import bawei.com.zhangduweijingdongproject.R;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.HomeBean;
import bawei.com.zhangduweijingdongproject.zdwview.zdwholder.MiaoShaHolder;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.OnItemListner;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class MiaoShaAdapter extends RecyclerView.Adapter<MiaoShaHolder>{
    private HomeBean.MiaoshaBean miaosha;
    private Context context;
    private OnItemListner onItemListner;

    public MiaoShaAdapter(Context context, HomeBean.MiaoshaBean miaosha) {
        this.context = context;
        this.miaosha = miaosha;
    }

    @Override
    public MiaoShaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.miao_sha_item_layout,null);
        MiaoShaHolder miaoShaHolder = new MiaoShaHolder(view);

        return miaoShaHolder;
    }

    @Override
    public void onBindViewHolder(MiaoShaHolder holder, final int position) {

        String[] strings = miaosha.getList().get(position).getImages().split("\\|");

        //赋值的操作
        Glide.with(context).load(strings[0]).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onItemListner.onItemClick(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return miaosha.getList().size();
    }

    public void setOnItemListner(OnItemListner onItemListner) {
        this.onItemListner = onItemListner;
    }
}
