package seeMyGo.SinglePattern;

/**
 * 单例模式的类只允许创建一个类对象
 * 思路是
 * 1、只能内部调用构造方法，从而杜绝外部创建对象
 * 2、内部只有一个静态私有的方法创建对象
 * 3、外部可以通过getInstance()拿到创建的这个对象
 */

public class Rocket {
    private static Rocket instance = new Rocket();
    private Rocket(){

    }
    public static Rocket getInstance() {
        return instance;
    }
}
