package bawei.com.zhangduweijingdongproject.zdwview.zdwadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import bawei.com.zhangduweijingdongproject.R;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.HomeBean;
import bawei.com.zhangduweijingdongproject.zdwview.zdwholder.TuiJianHolder;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.OnItemListner;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class TuiJianAdapter extends RecyclerView.Adapter<TuiJianHolder>{
    private HomeBean.TuijianBean tuijian;
    private Context context;
    private OnItemListner onItemListner;

    public TuiJianAdapter(Context context, HomeBean.TuijianBean tuijian) {
        this.context = context;
        this.tuijian = tuijian;
    }

    @Override
    public TuiJianHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.tui_jian_item_layout,null);

        TuiJianHolder tuiJianHolder = new TuiJianHolder(view);

        return tuiJianHolder;
    }

    @Override
    public void onBindViewHolder(TuiJianHolder holder, final int position) {
        HomeBean.TuijianBean.ListBean listBean = tuijian.getList().get(position);

        //赋值
        holder.tui_jian_item_title.setText(listBean.getTitle());
        holder.tui_jian_item_price.setText("¥"+listBean.getBargainPrice());

        String[] strings = listBean.getImages().split("\\|");
        Glide.with(context).load(strings[0]).into(holder.tui_jian_image);

        //点击
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onItemListner.onItemClick(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return tuijian.getList().size();
    }

    public void setOnItemListner(OnItemListner onItemListner) {
        this.onItemListner = onItemListner;
    }
}
