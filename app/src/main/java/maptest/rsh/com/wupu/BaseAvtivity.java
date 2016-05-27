package maptest.rsh.com.wupu;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by renshuhui on 2016/5/27.
 */
public abstract class BaseAvtivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(baseContentView());

    }
    abstract void initFindView();
    abstract void initData();
    abstract int baseContentView();
}
