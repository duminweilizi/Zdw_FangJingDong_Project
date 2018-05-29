package bawei.com.zhangduweijingdongproject.zdwview.zdwiview;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */



public interface OnItemListner {

    //条目点击的方法
    void onItemClick(int position);

    //条目长按的方法
    void onItemLongClick(int position);

}