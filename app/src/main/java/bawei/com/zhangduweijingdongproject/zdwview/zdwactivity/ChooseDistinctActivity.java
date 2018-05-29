package bawei.com.zhangduweijingdongproject.zdwview.zdwactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bawei.com.zhangduweijingdongproject.R;
import bawei.com.zhangduweijingdongproject.zdwview.zdwfragment.FragmentProvince;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */

public class ChooseDistinctActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_distinct);

        //已进入这个activity显示的是省的数据...用省的fragment进行替换
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content,new FragmentProvince()).commit();
    }
}

