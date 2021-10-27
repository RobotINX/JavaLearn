import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//int number = input.nextInt();
		int[] digit = new int[5];//存放求得的每一位数字
		int count = 0;//记录个数
		for(int number = 10000; number <= 99999; number++){
			int result = 0;
			//获取每一位数字
			for(int i = 0; i < digit.length; i++){
				digit[i] = number / (int)Math.pow(10,i) % 10;
			}
			//计算每一位数字的次方和
			for(int i = 0; i < digit.length; i++){
				result = result + (int)Math.pow(digit[i],digit.length);
			}
			//判断是次方和是否等于原数字
			if(result == number){
				System.out.println(number);
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}