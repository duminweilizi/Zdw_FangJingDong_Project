package bawei.com.zhangduweijingdongproject.zdwview.zdwactivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import bawei.com.zhangduweijingdongproject.R;

/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class BootPageActivity extends AppCompatActivity {


    private ImageView splash_pic;
    private TextView spalsh_time;
    private MyHandler myHandler = new MyHandler();
    private int time = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot_page);

        splash_pic = findViewById(R.id.splash_pic);
        spalsh_time = findViewById(R.id.spalsh_time);
//        //十秒跳转
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(BootPageActivity.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        };
////默认值
        spalsh_time.setText(time+"");

        myHandler.sendEmptyMessageDelayed(0, 1000);

//        handler.postDelayed(runnable,3000);

    }
    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    time--;
                    spalsh_time.setText(time + "");
                    if (time == 1) {
                        myHandler.removeCallbacksAndMessages(null);
                        //跳转
                        startActivity(new Intent(BootPageActivity.this, MainActivity.class));
                    } else {
                        myHandler.sendEmptyMessageDelayed(0, 1000);
                    }
                    break;
            }
        }
    }

}
