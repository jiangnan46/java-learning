package chapter8708;

import java.util.Scanner;

public class Test3 {
    //将数字金额转换为大写文字，控制台输入123，输出为壹佰贰拾叁元
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money > 0 && money < 999999999) {
                    break;
            } else {
                System.out.println("该金额无效，请重新输入");
            }
        }
        String str="";
        while (true){
            int ge= money%10;
            String moneyStr=getCapitalNumber(ge);
            str=moneyStr+str;
            money=money/10;
            if(money==0){
                break;
            }
        }
        int count=9-str.length();
        for(int i=0;i<count;i++){
            str="零"+str;
        }
        System.out.println(str);
        String[] arr={"亿","仟","佰","拾","万","仟","佰","拾","元"};
        String result="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            result=result+c+arr[i];
        }
        System.out.println(result);
    }
        public static String getCapitalNumber ( int number){
            String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
            return arr[number];
        }
    }
