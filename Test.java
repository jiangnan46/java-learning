package chapter8716;

public class Test {
    static void main(String[] args) {
        Student s=new Student();
        s.setName("林东");
        s.setAge(18);
        Teacher t=new Teacher();
        t.setName("小安");
        t.setAge(39);
        Administrator a=new Administrator();
        a.setName("平平");
        a.setAge(29);
        register(s);
        register(t);
        register(a);
    }
    public static void register(Person p){
        p.show();
    }
}
