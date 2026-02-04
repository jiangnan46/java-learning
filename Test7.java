package chapter8708;

import java.util.Scanner;

public class Test7{
    //定义方法，将阿拉伯数字的字符串转化为罗马数字字符串
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字字符串：");
        String number = sc.next();
        while (true) {
            boolean flag = checkStr(number);
            if (flag) {
                break;
            } else {
                System.out.println("不符合规则，请重新输入");
                continue;
            }
        }
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char a = number.charAt(i);
            int c = a - 48;
            String str=Rome(c);
            result.append(str);
        }
        System.out.println(result);

    }
    public static String Rome(int number) {
        String[] arr= {" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }
  public static boolean checkStr(String str){
        if(str.length()>9){
            return  false;
        }
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a<'0'||a>'9'){
                return false;
            }
        }
        return true;
  }
}






