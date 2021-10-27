版权声明：本文为博主原创文章，未经博主允许不得转载。
自学到这里，看完书有点乱，整理一下
一、基本数据类型与其对应的封装类之间的相互转换
     1.基本数据类型转换为封装类
        有三种方法：
        a.直接赋值  (自动装箱)       
[java] view plain copy
Integer i=3;  
        b.使用封装类的含参构造方法(实例化)
[java] view plain copy
Integer i=new Integer(3);  
        c.使用封装类提供的valueOf()方法(静态方法)
[java] view plain copy
Integer i=Integer.valueOf(3);  

    2.封装类转换为基本数据类型
       有两种方法：
       a.直接赋值(自动拆箱)
[java] view plain copy
Integer i=new Integer(2);  
int j=i;  
        b.使用封装类提供的value()方法
[java] view plain copy
Integer i=new Integer(3);  
int j=i.intValue();  
float f=i.floatValue();  
二、基本数据类型与字符串之间的相互转换       
       1.基本数据类型转换为字符串
          有三种方法：
          a.使用String类的valueOf()方法(静态方法)
[java] view plain copy
String s=String.valueOf(123);  
          b.使用封装类的toString()方法(静态方法)
[java] view plain copy
String s=Integer.toString(3);  
          c.使用字符串连接符“+”
[java] view plain copy
String s=""+123;  
       2.字符串转换为基本数据类型
          有一种方法：
          a.使用封装类的静态方法
[java] view plain copy
int i=Integer.parseInt("12");  
三、封装类与字符串之间的相互转换
       1.字符串转换为封装类          
          有两种方法：
          a.使用封装类的含参构造方法(实例化)
[java] view plain copy
Integer i=new Integer("123");  

          b.使用封装类的valueOf()方法
[java] view plain copy
Integer i=Integer.valueOf("123");  

       2.封装类转换为字符串
          有三种方法：
          a.使用字符串连接符“+”
[java] view plain copy
Integer i=new Integer(123);  
String s=""+i;  

         b.使用封装类的toString()方法
[java] view plain copy
Integer i=new Integer(123);  
String s=i.toString();  

          c.使用String类的valueOf()方法
[java] view plain copy
Integer i=Integer.valueOf(123);  
  
String s=String.valueOf(i);  

四、总结
         以上所列都是基本数据类型、封装类和字符串两两之间的直接转换，因此，可以衍生出来一些其他的东西，类似数学中的等量代换吧
举例说明：
[java] view plain copy
Integer i=new Integer(23);  
String s=Integer.toString(i);  

这两行代码中，封装类Integer的toString方法要求的参数是基本数据类型int，但是变量i是int的封装类，所以这里就有一个把Integer转换为int的过程，即自动装箱

。。。

类似的还有很多，大家自行分析测试，也希望大家可以在平时的编程过程中灵活运用。

自学，知识有限，不足之处，万望谅解，有什么补充意见或者建议，请联系博主，一起讨论，共同进步。