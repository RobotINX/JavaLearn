package oldCode;

import java.util.Scanner;
class FibonacciMod1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] FibonacciMod = new int[1000001];//数组FibonacciMod用来保存余数
		int n = input.nextInt();
		input.close();
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