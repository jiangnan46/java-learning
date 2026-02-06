package chapter8708;

import java.util.Scanner;

public class Test9 {
    static void main(String[] args) {
        //输入英文字符串，输出最后一个英文单词的长度
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入英文字符串：");
        String str=sc.nextLine();
        int result=number(str);
        System.out.println(result);
    }

    public static int number(String str) {
        int index = str.length() - 1;
        int end = index;
        while(index>=0&&str.charAt(index)!=' '){
            index--;
        }
        return (end-index);
    }
}