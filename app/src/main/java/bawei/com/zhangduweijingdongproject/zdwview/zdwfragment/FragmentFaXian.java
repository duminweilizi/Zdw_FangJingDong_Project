package bawei.com.zhangduweijingdongproject.zdwview.zdwfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

import bawei.com.zhangduweijingdongproject.R;
import bawei.com.zhangduweijingdongproject.zdwmodel.bean.VideoBean;
import bawei.com.zhangduweijingdongproject.zdwutils.ApiUtil;
import bawei.com.zhangduweijingdongproject.zdwutils.ChenJinUtil;
import bawei.com.zhangduweijingdongproject.zdwutils.MyService;
import bawei.com.zhangduweijingdongproject.zdwview.zdwadapter.MyVideoAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Author:张杜伟
 * Email:58588471@qq.com
 * Demand:Shopping
 */


public class FragmentFaXian extends Fragment {

    private ImageView imageView;
    private RecyclerView find_rec;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_faxain, container, false);

        find_rec = view.findViewById(R.id.find_rec);
        initdatas();
        return view;
    }

    public void initdatas(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiUtil.Video_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MyService myService = retrofit.create(MyService.class);

        Map<String,String> map = new HashMap<>();
        map.put("type","4");
        map.put("page","1");

        Call<VideoBean> call = myService.getvideodata(map);

        call.enqueue(new Callback<VideoBean>() {
            @Override
            public void onResponse(Call<VideoBean> call, Response<VideoBean> response) {
                if (response.isSuccessful()){
                    VideoBean videoBean = response.body();
                    find_rec.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
                    MyVideoAdapter myVideoAdapter = new MyVideoAdapter(getContext(),videoBean);
                    find_rec.setAdapter(myVideoAdapter);
                    //添加自定义分割线
                    DividerItemDecoration divider = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
                    divider.setDrawable(ContextCompat.getDrawable(getContext(),R.drawable.custom_divider));
                    find_rec.addItemDecoration(divider);
                }
            }

            @Override
            public void onFailure(Call<VideoBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initChenJin();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        if (! hidden) {
            initChenJin();
        }
    }

    private void initChenJin() {
        ChenJinUtil.setStatusBarColor(getActivity(), getResources().getColor(R.color.colorPrimaryDark));
    }
}

