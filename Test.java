package chapter8721;

public class Test {
    static void main(String[] args) {
        new Outer(){

            @Override
            public void swim() {
                System.out.println("重写了方法");
            }
        };
        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };
        method(new Animal() {
                   @Override
                   public void eat() {
                       System.out.println("我要吃红烧莲藕");
                   }
               }

        );
    }
    public static void method(Animal a){
        a.eat();
    }
}
