package bean;

import java.io.Serializable;

/**
 * Created by 张汉江 on 2018/1/21
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 3811963785287156613L;



    public static  int tall=20;

    private transient String name;//transient 表示该变量不参与序列化

    private  int age;

    private  int maill;

    public int getMaill() {
        return maill;
    }

    public void setMaill(int maill) {
        this.maill = maill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maill=" + maill +
                '}';
    }
}
