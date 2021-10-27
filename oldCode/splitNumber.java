/*
 *把若干个球分别放到不同的盒子里，问有一共有多少种不同的放法
 *number表示球的总数
 *array表示装球的盒子
 *index表示盒子的序号
 */
class Main{
	public static void main(String[] args){
		int number = 10;
		int[] array = new int[1000];
		split(number, array, 0);
	}
	
	public static void split(int number, int[] array, int index){
		//当放到最后没有球的时候，把每个盒子里装了多少个球打印出来
		if(number == 0){
			for(int i = 0; i < index; i++)
				System.out.print(array[i] + " ");
			System.out.println();
			return;
		}
		
		//temp表示index盒子里有多少个球，其余球进行递归分放
		//当手里没有球的时候循环终止
		for(int temp = number; temp > 0; temp--){
			//不允许后面的盒子里装的球数比前面的盒子里装的球数多
			if(index > 0 && temp > array[index-1])
				continue;
			array[index] = temp;
			split(number - temp, array, index+1);
		}
	}
}