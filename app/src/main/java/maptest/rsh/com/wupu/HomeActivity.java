package maptest.rsh.com.wupu;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import maptest.Fragment.com.FragmentCircle;
import maptest.Fragment.com.FragmentHomePage;
import maptest.Fragment.com.FragmentPerson;
import maptest.Fragment.com.FragmentVideo;
import maptest.Fragment.com.Fragmentactivity;

public class HomeActivity extends BaseAvtivity implements View.OnClickListener{
    private ImageView home_shouye;
    private ImageView home_huodong;
    private ImageView home_shiping;
    private ImageView home_quanzi;
    private ImageView home_geren;
    private FrameLayout home_addFragment;
    private long mExitTime;
    private FragmentHomePage fragmentHomePage;
    private Fragmentactivity fragmentactivity;
    private FragmentVideo fragmentVideo;
    private FragmentCircle fragmentCircle;
    private FragmentPerson fragmentPerson;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    void initFindView() {
        home_addFragment = (FrameLayout) findViewById(R.id.home_AddFragment);
        home_shouye = (ImageView) findViewById(R.id.home_shouye);
        home_huodong = (ImageView) findViewById(R.id.home_huodong);
        home_shiping = (ImageView) findViewById(R.id.home_shiping);
        home_quanzi = (ImageView) findViewById(R.id.home_quanzi);
        home_geren = (ImageView) findViewById(R.id.home_geren);
        home_shouye.setOnClickListener(this);
        home_huodong.setOnClickListener(this);
        home_quanzi.setOnClickListener(this);
        home_geren.setOnClickListener(this);
        home_shiping.setOnClickListener(this);

    }

    @Override
    void initData() {
        fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragmentHomePage = new FragmentHomePage();
        fragmentactivity = new Fragmentactivity();
        fragmentVideo = new FragmentVideo();
        fragmentCircle = new FragmentCircle();
        fragmentPerson = new FragmentPerson();
        ft.add(R.id.home_AddFragment, fragmentHomePage, "f1").show(fragmentHomePage);
        ft.add(R.id.home_AddFragment, fragmentactivity, "f2").hide(fragmentactivity);
        ft.add(R.id.home_AddFragment, fragmentVideo, "f3").hide(fragmentVideo);
        ft.add(R.id.home_AddFragment, fragmentCircle, "f4").hide(fragmentCircle);
        ft.add(R.id.home_AddFragment, fragmentPerson, "f5").hide(fragmentPerson);
        ft.commit();
    }

    @Override
    int baseContentView() {
        return R.layout.activity_home;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_shouye:
                FragmentTransaction ft1 = fm.beginTransaction();
                ft1.show(fragmentHomePage);
                ft1.hide(fragmentactivity);
                ft1.hide(fragmentVideo);
                ft1.hide(fragmentCircle);
                ft1.hide(fragmentPerson);
                ft1.commit();
                break;
            case R.id.home_huodong:
                FragmentTransaction ft2 = fm.beginTransaction();
                ft2.hide(fragmentHomePage);
                ft2.show(fragmentactivity);
                ft2.hide(fragmentVideo);
                ft2.hide(fragmentCircle);
                ft2.hide(fragmentPerson);
                ft2.commit();
                break;
            case R.id.home_shiping:
                FragmentTransaction ft3 = fm.beginTransaction();
                ft3.hide(fragmentHomePage);
                ft3.hide(fragmentactivity);
                ft3.show(fragmentVideo);
                ft3.hide(fragmentCircle);
                ft3.hide(fragmentPerson);
                ft3.commit();
                break;
            case R.id.home_quanzi:
                    FragmentTransaction ft4 = fm.beginTransaction();
                    ft4.hide(fragmentHomePage);
                    ft4.hide(fragmentactivity);
                    ft4.hide(fragmentVideo);
                    ft4.show(fragmentCircle);
                    ft4.hide(fragmentPerson);
                    ft4.commit();
                break;
            case R.id.home_geren:
                FragmentTransaction ft5 = fm.beginTransaction();
                ft5.hide(fragmentHomePage);
                ft5.hide(fragmentactivity);
                ft5.hide(fragmentVideo);
                ft5.hide(fragmentCircle);
                ft5.show(fragmentPerson);
                ft5.commit();
                break;
        }
    }
    // 点击两次返回键退出
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();

            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
