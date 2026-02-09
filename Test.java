package chapter8711;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        loop:while(true){
            System.out.println("--------欢迎使用学生管理系统-------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出学生管理系统");
            System.out.println("输入数字，使用对应功能");
            Scanner sc=new Scanner(System.in);
            String number=sc.next();
            switch (number){
                case"1"->addStudent(list);
                case"2"->deleteStudent(list);
                case"3"->updateStudent(list);
                case"4"->queryStudent(list);
                case"5"->{
                    System.out.println("已经退出");
                    break loop;
                }
                default->System.out.println("没有这个选项");
            }

        }
    }
    public static void addStudent(ArrayList<Student> list){
        System.out.println("请添加学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生id");
        String id=sc.next();
        boolean flag=contain(list,id);
        if(flag){
            System.out.println("此id已经存在，您需要重新录入");
        }else{
            System.out.println("请输入学生姓名");
            String name=sc.next();
            System.out.println("请输入学生年龄");
            int age=sc.nextInt();
            System.out.println("请输入学生家庭住址");
            String address=sc.next();
            Student stu=new Student(id,name,age,address);
            list.add(stu);
            System.out.println("学生信息添加成功");
        }

    }
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("请删除学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入想要删除的学生id");
        String id=sc.next();
        for(int i=0;i< list.size();i++){
            int index=getIndex(list,id);
            if(index>=0){
                list.remove(id);
                System.out.println("id为"+id+"已经删除");
            }else{
                System.out.println("id不存在");
            }
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("请修改学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要修改的学生id");
        String id=sc.next();
       int index= getIndex(list,id);
       if(index<0){
           System.out.println("当前id不存在，请重新输入");
       }
           Student stu=list.get(index);
           System.out.println("输入需要修改的姓名");
           String newName=sc.next();
           stu.setName(newName);
           System.out.println("输入需要修改的年龄");
           int newAge=sc.nextInt();
           stu.setAge(newAge);
           System.out.println("输入需要修改的家庭住址");
           String newAddress=sc.next();
           stu.setAddress(newAddress);

    }
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("请查询学生");
            if(list.size()==0){
                System.out.println("当前无学生信息");
                return;
            }
            System.out.println("id\t姓名\t年龄\t家庭住址\t");
            for(int i=0;i< list.size();i++){
               Student stu=list.get(i);
               System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }
    }
    //判断id唯一性
    public static boolean contain(ArrayList<Student> list,String id){
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).getId().equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(list,id)>=0;
    }
    public static int getIndex(ArrayList<Student> list,String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
