package note;

import java.util.Scanner;
class test{
	//二维数组遍历随机赋值
	public static void setRandomValue2D(int[][] array2D){
		for(int i = 0; i < array2D.length; i++){
			setRandomValue(array2D[i]);
		}
	}
	
	//一维数组遍历随机赋值
	public static void setRandomValue(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*10);
		}
	}
	
	//二维数组遍历输出
	public static void printArray2D(int[][] array2D){
		for(int i = 0; i < array2D.length; i++){
			printArray(array2D[i]);
		}
	}
	
	//一维数组遍历输出
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			if(i == array.length - 1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i] + ",");
			}
		}
	}
	
	//二维数组求和
	public static int sumArray2D(int[][] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum = sum + sumArray(array[i]);
		}
		return sum;
	}
	
	
	//一维数组求和
	public static int sumArray(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		return sum;
	}
	
	/*
		杨辉三角形
			1
			1 1	
			1 2 1
			1 3 3 1
			1 4 6 4 1 
			1 5 10 10 5 1
		行数为i，列数为j
		1、(i,i) = 1
		2、(i,j) = (i-1,j)+(i-1,j-1)
		3、(i,1) = 1
	*/
	public static void setYanghuiTriangle(int[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j <= i; j++){
				if(i == j || j == 0){
					array[i][j] = 1;
				}
				else{
					array[i][j] = array[i-1][j] + array[i-1][j-1];
				}
			}
		}
	}
	//二维数组遍历输出
	public static void yanghuiTrianglePrintArray2D(int[][] array2D){
		for(int i = 0; i < array2D.length; i++){
			yanghuiTrianglePrintArray(array2D[i]);
		}
	}
	
	//一维数组遍历输出
	public static void yanghuiTrianglePrintArray(int[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i] == 0){
				System.out.println();
				break;
			}
			else if(i == array.length - 1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i] + ",");
			}
		}
	}
	
	public static int getYanghuiTriangle(int i, int j){
		int result = 0;
		if(i == j || j == 1){
			result = 1;
		}
		else{
			result = getYanghuiTriangle(i-1,j) + getYanghuiTriangle(i-1,j-1);
		}
		return result;
	}
	
	public static void main(String args[]){
		/* 
			int[][] array2D = new int[10][10];
			setRandomValue2D(array2D);
			printArray2D(array2D);
			int sumArray2D = sumArray2D(array2D);
			System.out.println(sumArray2D);
		
			int[][] yanghuiTriangle = new int[20][20];
			setYanghuiTriangle(yanghuiTriangle);
			yanghuiTrianglePrintArray2D(yanghuiTriangle);
		*/
		Scanner input = new Scanner(System.in);
		input.close();
		int i = input.nextInt();
		int j = input.nextInt();
		int result = getYanghuiTriangle(i,j);

		System.out.println(result);
	}
}