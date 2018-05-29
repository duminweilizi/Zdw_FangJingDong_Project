package bawei.com.zhangduweijingdongproject.zdwpresenter;

import bawei.com.zhangduweijingdongproject.zdwmodel.ProductListModel;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.ProductListBean;
import bawei.com.zhangduweijingdongproject.zdwpresenter.inter.ProductListPresenterInter;
import bawei.com.zhangduweijingdongproject.zdwview.zdwiview.ProductListActivityInter;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class ProductListPresenter implements ProductListPresenterInter {

    private ProductListModel productListModel;
    private ProductListActivityInter productListActivityInter;

    public ProductListPresenter(ProductListActivityInter productListActivityInter) {
        this.productListActivityInter = productListActivityInter;

        productListModel = new ProductListModel(this);
    }

    public void getProductData(String seartchUrl, String keywords, int page) {

        productListModel.getProductData(seartchUrl,keywords,page);
    }

    @Override
    public void onSuccess(ProductListBean productListBean) {
        productListActivityInter.getProductDataSuccess(productListBean);
    }
}
