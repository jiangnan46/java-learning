package chapter8719;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void study();
}
