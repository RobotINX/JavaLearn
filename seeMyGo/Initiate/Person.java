package seeMyGo.Initiate;

public class Person {
    int age;
    Person(){
        System.out.println("Person constructor");
    }
    static{
        System.out.println("Person static initiate");
    }
    {
        System.out.println("Person initiate");
    }
}
