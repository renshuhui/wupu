package maptest.Toll.com;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by renshuhui on 2016/5/28.
 */
public  class NetWorkRequest {
    public  static String string;
    public static String getOkHttpClient(String url){

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response execute = okHttpClient.newCall(request).execute();
            string = execute.body().string();
            if(execute.isSuccessful()){
                return string;
            }
            else {
                throw new IOException("错误" + execute);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }
}
