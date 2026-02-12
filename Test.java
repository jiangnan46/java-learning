package chapter8715;

public class Test {
    static void main(String[] args) {
        Manager m=new Manager("1334","老六",15000,1500);
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBonus());
        m.work();
        m.eat();



        Cook c=new Cook();
        c.setId("1234");
        c.setName("老八");
        c.setSalary(1900);

        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.eat();
        c.work();

    }

}
