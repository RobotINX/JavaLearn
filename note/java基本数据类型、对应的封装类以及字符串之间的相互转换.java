��Ȩ����������Ϊ����ԭ�����£�δ������������ת�ء�
��ѧ������������е��ң�����һ��
һ�������������������Ӧ�ķ�װ��֮����໥ת��
     1.������������ת��Ϊ��װ��
        �����ַ�����
        a.ֱ�Ӹ�ֵ  (�Զ�װ��)       
[java] view plain copy
Integer i=3;  
        b.ʹ�÷�װ��ĺ��ι��췽��(ʵ����)
[java] view plain copy
Integer i=new Integer(3);  
        c.ʹ�÷�װ���ṩ��valueOf()����(��̬����)
[java] view plain copy
Integer i=Integer.valueOf(3);  

    2.��װ��ת��Ϊ������������
       �����ַ�����
       a.ֱ�Ӹ�ֵ(�Զ�����)
[java] view plain copy
Integer i=new Integer(2);  
int j=i;  
        b.ʹ�÷�װ���ṩ��value()����
[java] view plain copy
Integer i=new Integer(3);  
int j=i.intValue();  
float f=i.floatValue();  
�������������������ַ���֮����໥ת��       
       1.������������ת��Ϊ�ַ���
          �����ַ�����
          a.ʹ��String���valueOf()����(��̬����)
[java] view plain copy
String s=String.valueOf(123);  
          b.ʹ�÷�װ���toString()����(��̬����)
[java] view plain copy
String s=Integer.toString(3);  
          c.ʹ���ַ������ӷ���+��
[java] view plain copy
String s=""+123;  
       2.�ַ���ת��Ϊ������������
          ��һ�ַ�����
          a.ʹ�÷�װ��ľ�̬����
[java] view plain copy
int i=Integer.parseInt("12");  
������װ�����ַ���֮����໥ת��
       1.�ַ���ת��Ϊ��װ��          
          �����ַ�����
          a.ʹ�÷�װ��ĺ��ι��췽��(ʵ����)
[java] view plain copy
Integer i=new Integer("123");  

          b.ʹ�÷�װ���valueOf()����
[java] view plain copy
Integer i=Integer.valueOf("123");  

       2.��װ��ת��Ϊ�ַ���
          �����ַ�����
          a.ʹ���ַ������ӷ���+��
[java] view plain copy
Integer i=new Integer(123);  
String s=""+i;  

         b.ʹ�÷�װ���toString()����
[java] view plain copy
Integer i=new Integer(123);  
String s=i.toString();  

          c.ʹ��String���valueOf()����
[java] view plain copy
Integer i=Integer.valueOf(123);  
  
String s=String.valueOf(i);  

�ġ��ܽ�
         �������ж��ǻ����������͡���װ����ַ�������֮���ֱ��ת������ˣ�������������һЩ�����Ķ�����������ѧ�еĵ���������
����˵����
[java] view plain copy
Integer i=new Integer(23);  
String s=Integer.toString(i);  

�����д����У���װ��Integer��toString����Ҫ��Ĳ����ǻ�����������int�����Ǳ���i��int�ķ�װ�࣬�����������һ����Integerת��Ϊint�Ĺ��̣����Զ�װ��

������

���ƵĻ��кܶ࣬������з������ԣ�Ҳϣ����ҿ�����ƽʱ�ı�̹�����������á�

��ѧ��֪ʶ���ޣ�����֮���������½⣬��ʲô����������߽��飬����ϵ������һ�����ۣ���ͬ������