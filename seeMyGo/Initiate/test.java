package seeMyGo.Initiate;

/**
 * 在类的初始化的时候
 * 首先会先执行父类的初始化
 * 而在初始化的过程中，因为静态变量会在类被第一次调用的时候被初始化
 * 所以首先会调用父类的静态初始化，输出
 * Person static initiate
 * 然后会调用子类的静态初始化，输出
 * Student static initiate
 * 之后会首先执行父类的构造方法
 * 而在执行父类的构造方法前，会首先执行父类变量的初始化，输出
 * Person Initiate
 * 然后执行父类的构造方法，输出
 * Person constructor
 * 到子类的构造方法，同样的，在执行子类的构造方法前会执行子类变量的初始化，输出
 * Student Initiate
 * 最后再执行子类的构造方法，输出
 * Student construor
 * 
 */
public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
    }
}
