package bawei.com.zhangduweijingdongproject.zdwview.zdwholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bawei.com.zhangduweijingdongproject.R;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */



public class FenRecyclerInnerHolder extends RecyclerView.ViewHolder {

    public ImageView recycler_innner_image;
    public TextView recycler_inner_text;

    public FenRecyclerInnerHolder(View itemView) {
        super(itemView);

        recycler_innner_image = itemView.findViewById(R.id.recycler_innner_image);
        recycler_inner_text = itemView.findViewById(R.id.recycler_inner_text);

    }
}
