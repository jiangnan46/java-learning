package chapter8719;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球教练在学习");
    }
}
