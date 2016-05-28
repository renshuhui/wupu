package maptest.rsh.com.wupu;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends BaseAvtivity {
    private ImageView main_Navigate;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    void initFindView() {
       main_Navigate = (ImageView) findViewById(R.id.main_Navigate);
    }

    @Override
    void initData() {
            new Thread(){
                @Override
                public void run() {
                    handler.sendEmptyMessageDelayed(1,3000);
                }
            }.start();
    }

    @Override
    int baseContentView() {
        return R.layout.activity_main;
    }
}
