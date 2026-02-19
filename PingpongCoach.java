package chapter8719;

public class PingpongCoach extends Coach implements English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球教练在学习");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}
