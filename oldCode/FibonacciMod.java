/*
	��������
	Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��

	��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�

	�����ʽ
	�������һ������n��
	�����ʽ
	���һ�У�����һ����������ʾFn����10007��������
	˵�����ڱ����У�����Ҫ��Fn����10007���������������ֻҪ���������������ɣ�������Ҫ�ȼ����Fn��׼ȷֵ���ٽ�����Ľ������10007ȡ������ֱ�Ӽ������������������ԭ����ȡ��򵥡�
	
	���ݹ�ģ��Լ��
	1 <= n <= 1,000,000��
	
	����1
	ʹ������������F���У�ֻ�����10007��������
/*
/*
	1����������FibonacciMod����Fibonacci���еĳ���10007��������
		1������F1=F2=1,���FibonacciMod��FibonacciMod[0]��FibonacciMod[1]
		2�������FibonacciMod[i]����n��ֵѭ������
	2��ֱ�Ӹ��ݸ�����n������FibonacciMod�����������
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
		int[] FibonacciMod = new int[1000001];//����FibonacciMod������������
		int n = 0;
		//n = input.nextInt();
		n = Integer.parseInt(input.readLine());
		//ѭ�������ҳ�ֱ��FibonacciMod[n]������
		for(int i = 1;i <= n;i++){
			//�ȱ���FibonacciMod[1]��FibonacciMod[2]
			if(i==1)	
				FibonacciMod[i] = 1;
			else if(i==2)	
				FibonacciMod[i] = 1;
			else{		//���FibonacciMod[i-1]+FibonacciMod[i-2]<100007,��ôֱ�ӽ�FibonacciMod[i-1]+FibonacciMod[i-2]��ֵ��FibonacciMod[i]
				if(FibonacciMod[i-1]+FibonacciMod[i-2]<10007)
					FibonacciMod[i] = FibonacciMod[i-1] + FibonacciMod[i-2];
			//����FibonacciMod[i-1]+FibonacciMod[i-2]-100007��ֵ��FibonacciMod[i]
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	public static void main(String[] args) throws IOException{
	    //BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	    //String s=reader.readLine();
	    //int n=Integer.valueOf(s);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
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