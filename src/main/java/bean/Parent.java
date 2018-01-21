package bean;

import java.io.Serializable;

/**
 * Created by 张汉江 on 2018/1/21
 */
public class Parent implements Serializable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                '}';
    }
}
