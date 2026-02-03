package chapter8708;

import java.util.Scanner;

public class Test1 {
    //键盘输入一个字符串，统计其中的大写字母，小写字母及数字个数
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        int smallCount=0;
        int bigCount=0;
        int numberCount=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a>'a'&&a<'z'){
                smallCount++;
            }else if(a>'A'&&a<'Z'){
                bigCount++;
            } else if(a>'0'&&a<'9') {
                numberCount++;
            }
        }
        System.out.println("此字符串中的小写字母个数有"+smallCount+"个");
        System.out.println("此字符串中的大写字母个数有"+bigCount+"个");
        System.out.println("此字符串中的数字个数有"+numberCount+"个");
    }
}
