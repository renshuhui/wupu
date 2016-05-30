package maptest.vo.com;

/**
 * Created by renshuhui on 2016/5/28.
 */
public class Data {
    private String id;
    private String name;
    private String originalimg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalimg() {
        return originalimg;
    }

    public void setOriginalimg(String originalimg) {
        this.originalimg = originalimg;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", originalimg='" + originalimg + '\'' +
                '}';
    }

    public Data(String id, String name, String originalimg) {
        this.id = id;
        this.name = name;
        this.originalimg = originalimg;
    }
    public Data() {

    }

}
