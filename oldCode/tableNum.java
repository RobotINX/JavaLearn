/*
方格填数

如下的10个格子
   +--+--+--+		
   |  |  |  |			
+--+--+--+--+			
|  |  |  |  |			
+--+--+--+--+			
|  |  |  |
+--+--+--+

一个二维数组a[3][3]：其中a[0][0]、a[3][3]不能用
		关于i：i>=0,i<=3
		关于j：j>=0,j<=3
		且:	(i==3 && j==3)!=true
			(i==0 && j==0)!=true

并且：
1、在a[i][j]中a[i-1][j-1]、a[i-1][j]、a[i-1][j+1]
2、在a[i][j]中a[i][j-1]、、a[i][j+1]
3、在a[i][j]中a[i+1][j-1]、a[i+1][j]、a[i+1][j+1]
中连续的数字不能相邻
		public int isTable(int i,int j){
			if(i>=0&&i<=3){
				if(j>=0&&j<=3)
					return 1;
				else return 0;
			}
			else return 0;
		}

		
所以最后判断是否是表格的函数为：
		public int isTable(int i,int j){
			if(i>=0&&i<=3){
				if(j>=0&&j<=3){
					if((i==3&&j==3)||(i==0&&j==0))
						return 0;
					else 
						return 1;
				}
				else return 0;
			}
			else return 0;
		}


（如果显示有问题，也可以参看【图1.jpg】）

填入0~9的数字。要求：连续的两个数字不能相邻。
（左右、上下、对角都算相邻）

填入数字时不能有重复数字：
	1、创建一个长度为10的一维数组存放用过的数字
	2、使用遍历，查找当前数字是否与前面的数字都不相同
	3、如果不相同，返回1，相同则返回0
	int[] take = new int[10];
	public int isCommon(int count,int num){
		int bool = 0;
		for(int i = 0;i <= count;i++){
			if(take[i] == num){
				bool = 0;
				break;
			}
			else
				bool = 1;
		}
		return bool;
	}
	
填入数字时，要求相邻的两个格子内的数字不相邻：
	int num = 0;
	public int is









一共有多少种可能的填数方案？

请填写表示方案数目的整数。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/