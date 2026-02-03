package chapter8708;

public class Test4 {
    static void main(String[] args) {
        //给指定的数字打码
        String number="13215222196";
        String head=number.substring(0,3);
        String hind=number.substring(7);
        String result=head+"****"+hind;
        System.out.println(result);
    }
}
