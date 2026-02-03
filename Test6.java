package chapter8708;

public class Test6 {
    //定义方法，将int[]数组中的数据按照格式，拼接成一个字符串返回，调用方法，在控制台输出
    //例如：int[] arr={1,2,3} 输出[1,2,3]
    static void main(String[] args) {
        int[] arr={1,2,3};
        String result=arrToString(arr);
        System.out.println(result);
    }
    public static String arrToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        String result= sb.toString();
        return result;
    }
}
