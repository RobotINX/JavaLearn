package oldCode;

/*
	问题描述
	给定圆的半径r，求圆的面积。
	输入格式
	输入包含一个整数r，表示圆的半径。
	输出格式
	输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
	说明：在本题中，输入是一个整数，但是输出是一个实数。

	对于实数输出的问题，请一定看清楚实数输出的要求，比如本题中要求保留小数点后7位，则你的程序必须严格的输出7位小数，输出过多或者过少的小数位数都是不行的，都会被认为错误。

	实数输出的问题如果没有特别说明，舍入都是按四舍五入进行。

	样例输入
	4
	样例输出
	50.2654825
	数据规模与约定
	1 <= r <= 10000。
	提示
	本题对精度要求较高，请注意π的值应该取较精确的值。你可以使用常量来表示π，比如PI=3.14159265358979323，也可以使用数学公式来求π，比如PI=atan(1.0)*4。
*/
/*
	关键点：四舍五入七位小数
	半径r：int
	面积s：double
	常量PI：3.14159265358979323
	四舍五入方法：
		1、temp=s*100000000：先将结果放大100000000
		2、mod=temp%10：求放大100000000后个位数是多少
		3、if(mod>5&&mod<=9)
				temp=temp/10+1;
				result=temp/10000000;
		4、if(mod<=4&&mod>=0)
				temp=temp/10;
				result=temp/10000000;
*/
/*
import java.util.Scanner;
import java.math.BigDecimal;
import java.nio.Buffer;

class theAreaOfCircle{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Buffer bf = new Buffer(System)
		final double PI = 3.14159265358979323;
		int r = input.nextInt();
		double area = PI * r * r;;
		//System.out.println("area="+area);
		double resultRound = Math.round(area*Math.pow(10,7))/Math.pow(10,7);
		//System.out.println("resultRound="+resultRound);
		BigDecimal resultBigDecimal = new BigDecimal(resultRound);
		System.out.println("resultBigDecimal="+resultBigDecimal);
		
		BigDecimal  bg = new BigDecimal(bf.readLine());
		BigDecimal value = bg.multiply(bg.multiply(new BigDecimal(Math.PI))).setScale(7,BigDecimal.ROUND_HALF_UP);
	}
}
*/