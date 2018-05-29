package bawei.com.zhangduweijingdongproject.zdwview.zdwholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import bawei.com.zhangduweijingdongproject.R;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class FenLeiRecyclerOutHolder extends RecyclerView.ViewHolder {

    public TextView recycler_out_text;
    public RecyclerView recycler_innner;

    public FenLeiRecyclerOutHolder(View itemView) {
        super(itemView);

        recycler_out_text = itemView.findViewById(R.id.recycler_out_text);
        recycler_innner = itemView.findViewById(R.id.recycler_innner);

    }
}

