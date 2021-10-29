package note;

/* 
BASIC-13基础练习 数列排序 ?
时间限制：1.0s ? 内存限制：512.0MB
关键字：数组 排序
问题描述
　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
输入格式
　　第一行为一个整数n。
　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
输出格式
　　输出一行，按从小到大的顺序输出排序后的数列。
样例输入
5
8 3 6 4 9
样例输出
3 4 6 8 9
*/
import java.util.Scanner;
class 数组从小到大{

	//输出每一个数组中的每一个字符
	public static void PrintArrayElement(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//将字符串中的元素转到数组中
	public static void StringToArray(String[] arrayString, int[] arrayInt){
		for(int i = 0; i < arrayString.length; i++){
			arrayInt[i] = Integer.parseInt(arrayString[i]);
		}
	}
	
	//将数组中的元素按照从小到大的顺序重新排列
	public static void ResetArraySmallToBig(int[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]){
					array[i] = array[i] ^ array[j];
					array[j] = array[i] ^ array[j];
					array[i] = array[i] ^ array[j];
				}
			}
		}
	}
	
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int arrayLength = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		input.close();
		String[] arrayString = string.split(" ");
		int[] arrayInt = new int[arrayLength];
		StringToArray(arrayString,arrayInt);
		//PrintArrayElement(arrayInt);
		ResetArraySmallToBig(arrayInt);
		PrintArrayElement(arrayInt);
    }
}