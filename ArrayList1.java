package chapter8709;

import java.util.ArrayList;

public class ArrayList1 {
    //定义集合，添加用户对象，存入id，用户名，密码等三个属性，定义方法，用id寻找用户信息，存在则返回索引，不存在返回-1；
    static void main(String[] args) {
        ArrayList<User> list1=new ArrayList<>();
        User s1=new User("25040607","敏黎","123456");
        User s2=new User("25040609","敏与","1234586");
        User s3=new User("2504068","敏球","1234567");
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        int result=contain(list1,"25040609");
        System.out.println("此id所在索引为"+result);
    }
    public static int contain(ArrayList<User> list,String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
