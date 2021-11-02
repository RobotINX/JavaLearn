package seeMyGo.Initiate;

public class Student extends Person{
    int no;
    Student(){
        System.out.println("Student constructor");
    }
    static{
        System.out.println("Student static initiate");
    }
    {
        System.out.println("Student initiate");
    }
}
