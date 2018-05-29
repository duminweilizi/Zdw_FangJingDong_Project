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

public class ProDuctGridHolder extends RecyclerView.ViewHolder {

    public ImageView product_list_image;
    public TextView product_list_title;
    public TextView product_list_price;

    public ProDuctGridHolder(View itemView) {
        super(itemView);

        product_list_image = itemView.findViewById(R.id.product_list_image);
        product_list_title = itemView.findViewById(R.id.product_list_title);
        product_list_price = itemView.findViewById(R.id.product_list_price);

    }



}

