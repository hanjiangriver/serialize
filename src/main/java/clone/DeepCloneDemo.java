package clone;

import java.io.*;

/**
 * Created by 张汉江 on 2018/1/21
 *  Husband husband=new Husband(); Husband husband1=super.clone(); Husband 里面有对wife的引用
 * 浅克隆：对克隆对象本身来说  他们是不同的  但是克隆对象里面的对象的引用是一样的
 *  也就是说  husband与husband1 是两个不同的对象  但是wife 是一样的  因为他们有相同的引用
 * 深克隆：husband 和wife 都是不同的
 *
 */
public class DeepCloneDemo {


    public static void main(String[] args) throws ClassNotFoundException {


        Teacher teacher=new Teacher();
        teacher.setName("mic");
        Student student=new Student();
        student.setName("zhang");
        student.setAge(10);
        //student.setTeacher(teacher);
        Student student1=(Student) student.deepClone();
       // student1.getTeacher().setName("james");

        System.out.println(student);

        System.out.println(student==student1);
        System.out.println(student1);
    }

}
