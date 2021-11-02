package oldCode;

/*
	问题描述
	Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

	当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

	输入格式
	输入包含一个整数n。
	输出格式
	输出一行，包含一个整数，表示Fn除以10007的余数。
	说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。
	
	数据规模与约定
	1 <= n <= 1,000,000。
	
	锦囊1
	使用数组来保存F序列，只保存除10007的余数。
/*
/*
	1、创建数列FibonacciMod保存Fibonacci数列的除以10007的余数：
		1、根据F1=F2=1,算出FibonacciMod的FibonacciMod[0]和FibonacciMod[1]
		2、后面的FibonacciMod[i]根据n的值循环存入
	2、直接根据给出的n从数列FibonacciMod中输出该余数
*/
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
	    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	    String s=reader.readLine();
	    int n=Integer.valueOf(s);
	    int f1=1,f2=1,f3=0;
	    if(n<3){
	    	System.out.print("1");
	    	return;}
	    for(int i=3;i<=n;i++)
	    {if(f1>10007)f1=f1%10007;
	    if(f2>10007)f2=f2%10007;
	    f3=f1+f2;
	    f1=f2;
	    f2=f3;
	    }
	    System.out.print(f3%10007);
	    }
	    }
*/
/* 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.*;
class FibonacciMod{
	public static void main(String args[]) throws NumberFormatException, IOException{
		//Scanner input = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int[] FibonacciMod = new int[1000001];//数组FibonacciMod用来保存余数
		int n = 0;
		//n = input.nextInt();
		n = Integer.parseInt(input.readLine());
		//循环用来找出直到FibonacciMod[n]的余数
		for(int i = 1;i <= n;i++){
			//先保存FibonacciMod[1]和FibonacciMod[2]
			if(i==1)	
				FibonacciMod[i] = 1;
			else if(i==2)	
				FibonacciMod[i] = 1;
			else{		//如果FibonacciMod[i-1]+FibonacciMod[i-2]<100007,那么直接将FibonacciMod[i-1]+FibonacciMod[i-2]赋值给FibonacciMod[i]
				if(FibonacciMod[i-1]+FibonacciMod[i-2]<10007)
					FibonacciMod[i] = FibonacciMod[i-1] + FibonacciMod[i-2];
			//否则将FibonacciMod[i-1]+FibonacciMod[i-2]-100007赋值给FibonacciMod[i]
				else
					FibonacciMod[i] = FibonacciMod[i-1] + FibonacciMod[i-2] - 10007;
			}
		}
		//System.out.println();
		//System.out.println(n);
		System.out.println(FibonacciMod[n]);
	}
} 
*/
import java.util.Scanner;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
class Main {
	public static void main(String[] args) throws IOException{
	    //BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	    //String s=reader.readLine();
	    //int n=Integer.valueOf(s);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
	    int f1=1,f2=1,f3=0;
	    if(n<3){
	    	System.out.print("1");
	    	return;}
	    for(int i=3;i<=n;i++)
	    {if(f1>10007)f1=f1%10007;
	    if(f2>10007)f2=f2%10007;
	    f3=f1+f2;
	    f1=f2;
	    f2=f3;
	    }
	    System.out.print(f3%10007);
	}
}