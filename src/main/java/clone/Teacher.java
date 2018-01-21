package clone;

import java.io.Serializable;

/**
 * Created by 张汉江 on 2018/1/21
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = -2089818627439080026L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
