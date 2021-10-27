import java.util.Scanner;
class test{
	
	//给数组中的每一个元素随机赋值
	public static void setRandomValue(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}
	}
	
	//输出数组中的每一个元素
	//一行一个元素
	public static void printArrayElement1(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	//所有元素在同一行输出
	public static void printArrayElement(int[] array){
		for(int i = 0; i < array.length; i++){
			if(i == array.length-1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i] + ",");
			}
		}
	}
	
	//获取数组中元素的最大值
	public static int getMax(int[] array){
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			max = max > array[i] ? max : array[i];
		}
		return max;
	}
	
	//获取数组中元素的最小值
	public static int getMin(int[] array){
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			min = min < array[i] ? min : array[i];
		}
		return min;
	}
	
	//数组元素逆序1
	public static void resetArrayOrder1(int[] array){
		/* 	错误做法，这里的赋值运算是的tempArray得到了array的地址
			最终导致的结果是逆序一半之后丢失了另一半元素
			int[] tempArray = array;
			for(int i = 0, j = array.length - 1; i < array.length; i++,j--){
				array[i] = tempArray[j];
			}
		*/
		int[] tempArray = new int[15];
		//逆序获得array[]各个元素，并且存放到tempArray[]中
		for(int i = 0, j = array.length - 1; j >= 0; i++, j--){
			tempArray[i] = array[j];
		}
		//将tempArray[]中的元素放到array[]中
		for(int i = 0; i <array.length; i++){
			array[i] = tempArray[i];
		}
	}
	
	//数组元素逆序2
	public static void resetArrayOrder2(int[] array){
		//利用异或同一个数两次得到原数把两个元素交换位置
		//两个需要交换的数的下标i和j初始值为0和数组的长度-1
		//当i<数组长度的一半或者j大于且等于数组长度的一半时执行交换
		//另外，如果i和j相等也要停止交换
		//for(int i = 0, j = array.length - 1; i < array.length/2; i++, j--){
		for(int i = 0, j = array.length - 1; i < j; i++, j--){
			array[i] = array[i] ^ array[j];
			array[j] = array[i] ^ array[j];
			array[i] = array[i] ^ array[j];
		}
	}
	
	//数组元素查找
	public static int searchElement(int[] array,int element){
		/* 
			int i = 0;
			while(true){
				if(array[i] == element){
					break;
				}
				i++;
			}
			return i;
		*/
		int searchResult = -1;//默认返回值-1，如果找不到元素则返回-1
		for(int i = 0; i < array.length; i++){
			if(array[i] == element){
				searchResult = i;
			}
		}
		return searchResult;
	}
	
	public static void main(String args[]){
		/* 
			int[] array1 = new int[10];
			setRandomValue(array1);
			printArrayElement(array1);
			System.out.println("----------------------");
			int[] array2 = new int[10];
			setRandomValue(array2);
			printArrayElement(array2);
			int max = getMax(array2);
			int min = getMin(array2);
			System.out.println("max = " + max);
			System.out.println("min = " + min);
			System.out.println("----------------------"); 
			*/
			int[] array3 = new int[10];
			setRandomValue(array3);
			printArrayElement(array3);
			System.out.println("----------------------");
			resetArrayOrder2(array3);
			printArrayElement(array3);
			System.out.println("----------------------");
			System.out.println(array3[4]);
			int searchResult = searchElement(array3,array3[4]);
			System.out.println(searchResult);
		
	}
}