package chapter8712;

import java.util.ArrayList;

public class Demo {
    private Demo() {
    }

    public static int getMax(ArrayList<Student> list) {
        //定义参照物
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size();i++) {
            if(list.get(i).getAge()>max){
                max=list.get(i).getAge();
            }
        }
        return max;
    }
}