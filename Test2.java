package chapter8708;

public class Test2 {
    //定义方法，实现字符串反转，输入abc,输出为cba
    static void main(String[] args) {
        String result=reverse("abc");
        System.out.println("此字符串的的顺序倒过来为"+result);
    }
    public static String reverse(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            char a=str.charAt(i);
            result=result+a;
        }
        return result;
    }

}
