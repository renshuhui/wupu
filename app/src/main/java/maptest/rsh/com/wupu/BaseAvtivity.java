package maptest.rsh.com.wupu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by renshuhui on 2016/5/27.
 */
public abstract class BaseAvtivity extends FragmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(baseContentView());
        initFindView();
        initData();
    }
    abstract void initFindView();
    abstract void initData();
    abstract int baseContentView();
}
