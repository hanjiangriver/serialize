import bean.Person;
import com.alibaba.fastjson.JSON;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by 张汉江 on 2018/1/21
 */
public class SerialPerfect {

    private static Person init(){
        Person person=new Person();
        person.setName("zhanghj");
        person.setAge(20);
        return person;
    }

    public static void main(String[] args) throws IOException {
        excuteSerial();
        excuteSerialWithFast();
    }

    public static  void excuteSerial() throws IOException {
        Person person=init();
        ObjectMapper objectMapper=new ObjectMapper();
        byte[] bytes=null;
        long start=System.currentTimeMillis();
        for(int i=0;i<100;i++){
            bytes=objectMapper.writeValueAsBytes(person);
        }
        System.out.println("json 序列化耗时"+(System.currentTimeMillis()-start)+"ms 大小为"+bytes.length);
        person=objectMapper.readValue(bytes,Person.class);
    }

    public static  void excuteSerialWithFast() throws IOException {
        Person person=init();

        String text= null;

        long start=System.currentTimeMillis();
        for(int i=0;i<100;i++){
            text=JSON.toJSONString(person);
        }
        System.out.println("fastjson 序列化耗时"+(System.currentTimeMillis()-start)+"ms 大小为"+text.getBytes().length);
        person=JSON.parseObject(text,Person.class);
    }

}
