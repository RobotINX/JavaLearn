/* 
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] number = line.split(" ");//将字符串从“ ”截断成为两个字符串
		int a = Integer.parseInt(number[0]);//将字符串number[0]转换成整形数据
		int b = Integer.parseInt(number[1]);
		int sum = a + b;
		System.out.println(sum);
	}
}
*/

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int test1 = sc.nextInt();
		int test2 = sc.nextInt();
		System.out.println("test1="+test1);
		System.out.println("test2="+test2);
		System.out.println(test1 + test2);
		System.out.println("---------------");
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        System.out.println(a + b);
    }
}