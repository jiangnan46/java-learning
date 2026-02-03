package chapter8708;

import java.util.Scanner;

public class Test5 {
    //键盘接收一个字符串，判断其是否为对称字符串，在控制台打印是或不是
    //例如：123321是对称字符串，123123不是对称字符串
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String sb=sc.next();
        String result=new StringBuilder().append(sb).reverse().toString();
        if(result.equals(sb)){
            System.out.println(sb+"是对称字符串");
        }else{
            System.out.println(sb+"不是对称字符串");
        }
    }
}
