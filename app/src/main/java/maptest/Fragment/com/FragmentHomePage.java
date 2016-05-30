package maptest.Fragment.com;

import android.content.Context;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

import maptest.Toll.com.NetWorkRequest;
import maptest.adapter.com.TitlGVAdapter;
import maptest.rsh.com.wupu.R;
import maptest.vo.com.Data;
import maptest.vo.com.Title;

/**
 * Created by renshuhui on 2016/5/27.
 */
public class FragmentHomePage extends Fragment {
    private View view;
    private GridView titleGV;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fragmenthomepage,null);
        initfindView();
        init();
        return view;
    }

    private void initfindView() {
        titleGV = (GridView) view.findViewById(R.id.titleGV);
    }
    private void init() {
        new Thread(){
            @Override
            public void run() {
                final String okHttpClient = NetWorkRequest.getOkHttpClient("http://base.dancebook.com.cn/category/getAppCate");
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Gson gson = new Gson();
                        Title title = gson.fromJson(okHttpClient, Title.class);
                        ArrayList<Data> data = title.getData();
                        titleGV.setAdapter(new TitlGVAdapter(data,getActivity()));
                        Toast.makeText(getActivity(),data.toString(),Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }.start();
    }

}

