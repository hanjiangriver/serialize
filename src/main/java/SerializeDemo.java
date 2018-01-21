import bean.Person;

import java.io.*;

/**
 * Created by 张汉江 on 2018/1/21
 */
public class SerializeDemo {

    public static void main(String[] args) {
       //serializeDemo();
       // Person.tall=5;//序列化不保存 静态变量的状态 所以输出是5 相当于没有参与序列化 所以怎样改都不会报错
      //当加上 serialVersionUID后  序列化后再改变普通变量 然后再反序列化 程序也不会报错
       Person person=deserialzeDemo();
        System.out.println(person);
    }

    /**
     * 序列化
     */
    private static  void serializeDemo(){
        try {
            // 构建输出流   输出到person的文件里面
            ObjectOutputStream oo=new ObjectOutputStream(new
                    FileOutputStream(new File("person")));

            Person person=  new Person();
            person.setAge(20);
            person.setName("zhanghj");

            oo.writeObject(person);
            System.out.println("序列化成功");
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *反序列化
     */
    private static Person deserialzeDemo(){
        try {
            ObjectInputStream os=new ObjectInputStream(new FileInputStream(new File("person")));

            Person person=(Person) os.readObject();

            System.out.println(person);

            os.close();
            return person;

        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
