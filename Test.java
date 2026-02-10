package chapter8712;

import java.util.ArrayList;

public class Test {
    static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("赵子成",20,"男");
        Student s2=new Student("赵兰成",200,"女");
        Student s3=new Student("赵芳成",20,"男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int max=Demo.getMax(list);
        System.out.println("学生年龄最大的岁数为："+max+"岁");
    }
}
