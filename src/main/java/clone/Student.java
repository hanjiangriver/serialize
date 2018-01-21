package clone;

import java.io.*;

/**
 * Created by 张汉江 on 2018/1/21
 */
public class Student implements Serializable{
    private static final long serialVersionUID = -7849982947348405952L;

    private  String name;

    private  int age;

   // private Teacher teacher;

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

/*
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
*/

    public Object deepClone() throws ClassNotFoundException {

        try {

            //序列化
            ByteArrayOutputStream baos=new ByteArrayOutputStream();

            ObjectOutputStream oos=new ObjectOutputStream(baos);

            oos.writeObject(this);
           //反序列化
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());

            ObjectInputStream ois=new ObjectInputStream(bais);

            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
