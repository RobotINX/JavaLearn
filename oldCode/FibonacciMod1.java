import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] FibonacciMod = new int[1000001];//����FibonacciMod������������
		int n = input.nextInt();
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