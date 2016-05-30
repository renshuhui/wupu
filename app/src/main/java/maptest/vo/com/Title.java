package maptest.vo.com;

import java.util.ArrayList;

/**
 * Created by renshuhui on 2016/5/28.
 */
public class Title {
    private String code;
    private ArrayList<Data> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Title{" +
                "code='" + code + '\'' +
                ", data=" + data +
                '}';
    }

    public Title(String code, ArrayList<Data> data) {
        this.code = code;
        this.data = data;
    }
    public Title() {

    }
}
