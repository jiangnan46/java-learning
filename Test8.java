package chapter8708;

public class Test8 {
    static void main(String[] args) {
        //给定两个字符串，将其中一个字符串的第一个字母移到最后一个，若干次这样操作后，如过能够与另一个字符串重合，返回true，否则返回false
        String A="abcde";
    String B="cdeab";
      boolean result=compare(A,B);
      System.out.println(result);
}
public static boolean compare(String A,String B){
        for(int i=0;i<A.length();i++){
            A=chat(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
}
public static String chat(String str){
        char first=str.charAt(0);
        String end=str.substring(1);
        return end+first;
}
}