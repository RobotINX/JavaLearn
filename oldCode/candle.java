/* 
生日蜡烛

某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。

现在算起来，他一共吹熄了236根蜡烛。

请问，他从多少岁开始过生日party的？

请填写他开始过生日party的年龄数。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。

*/
/*
	假设开始吹蜡烛的年龄是start
		现在的年龄是end
		那么一共吹蜡烛的年数是year = end - start
		在这year年里一共吹了candle = start * year + year * (year - 1)/2
*/
class candle{
	public static void main(String args[]){
		int start = 1;
		int end = 1;
		int candle = 0;
		for(;end < 101;end++){
			for(start = 1;start < end;start++){
				int year = end - start;
				candle = start * year + year * (year - 1)/2;
				// System.out.println(start+"\t"+end+"\t"+candle);
				if(candle == 236)
					break;
			}
			if(candle == 236)
					break;
		}
		System.out.println(start+"\t"+end+"\t"+candle);
	}
}