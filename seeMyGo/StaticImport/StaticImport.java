package seeMyGo.StaticImport;

// 静态导入变量，省略包名和类名
import static java.lang.Math.PI;

public class StaticImport {
    public static double circleArea(double r){
        double area = PI * r * r;
        return area;
    }
}

