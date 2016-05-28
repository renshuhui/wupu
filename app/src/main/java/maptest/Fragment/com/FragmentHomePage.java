package maptest.Fragment.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import maptest.rsh.com.wupu.R;

/**
 * Created by renshuhui on 2016/5/27.
 */
public class FragmentHomePage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragmenthomepage,null);
        return view;
    }
}

