package maptest.adapter.com;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import maptest.rsh.com.wupu.R;
import maptest.vo.com.Data;

/**
 * Created by renshuhui on 2016/5/28.
 */
public class TitlGVAdapter extends BaseAdapter{
    ArrayList<Data> list;
    Context context;
    public TitlGVAdapter(ArrayList<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = null;
        H h = new H();
        if(view==null){
            v = View.inflate(context, R.layout.titlegvitem,null);
            h.htitlname = (TextView) v.findViewById(R.id.titlename);
            v.setTag(h);
        }

        else{
            v=view;
            h= (H) v.getTag();
        }
        if(i<9){
            h.htitlname.setText(list.get(i).getName());
        }
        if(i==9){

            h.htitlname.setText("全部");
        }

        return v;
    }
    class H{
        TextView htitlname;
    }
}
