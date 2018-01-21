import bean.Parent;
import bean.Son;

import java.io.*;

/**
 * Created by 张汉江 on 2018/1/21
 */

/**
 * 只要父类进行了序列化  那么子类序列化和反序列化都没有问题 也就是说子类继承了序列化
 *
 * 如果父类没有进行序列化  而子类进行了序列化 那么父类中的成员变量是没有办法做序列化的
 */
public class ParentSerializeDemo {

    public static void main(String[] args) {
        serializeDemo();
        deserializeDemo();
    }

    private static  void serializeDemo(){
        try {
            ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(new File("son")));
            Son son=new Son();
            son.setAge(18);//写两次  看一下文件大小的变化 第二次写入会多5个字节  加了引用
            oo.writeObject(son);
            oo.flush();
            oo.writeObject(son);
            oo.flush();
            System.out.println("序列化成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  static  void deserializeDemo(){
        try {
            ObjectInputStream os=new ObjectInputStream(new FileInputStream(new File("son")));

            Son son=(Son) os.readObject();

            System.out.println(son);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
