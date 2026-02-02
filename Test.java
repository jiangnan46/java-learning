package chapter8707;

public class Test {
    static void main(String[] args) {


        String s1 = "Abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        //比较的是地址值
        boolean result=s1.equals(s2);
        System.out.println(result);
        //比较内容是否完全相同
        boolean result1=s1.equalsIgnoreCase(s2);
        System.out.println(result1);
        //不考虑大小写，比较内容是否相同
    }
}