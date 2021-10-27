import java.util.Scanner;
class test{
	
	//�������е�ÿһ��Ԫ�������ֵ
	public static void setRandomValue(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}
	}
	
	//��������е�ÿһ��Ԫ��
	//һ��һ��Ԫ��
	public static void printArrayElement1(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	//����Ԫ����ͬһ�����
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
	
	//��ȡ������Ԫ�ص����ֵ
	public static int getMax(int[] array){
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			max = max > array[i] ? max : array[i];
		}
		return max;
	}
	
	//��ȡ������Ԫ�ص���Сֵ
	public static int getMin(int[] array){
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			min = min < array[i] ? min : array[i];
		}
		return min;
	}
	
	//����Ԫ������1
	public static void resetArrayOrder1(int[] array){
		/* 	��������������ĸ�ֵ�����ǵ�tempArray�õ���array�ĵ�ַ
			���յ��µĽ��������һ��֮��ʧ����һ��Ԫ��
			int[] tempArray = array;
			for(int i = 0, j = array.length - 1; i < array.length; i++,j--){
				array[i] = tempArray[j];
			}
		*/
		int[] tempArray = new int[15];
		//������array[]����Ԫ�أ����Ҵ�ŵ�tempArray[]��
		for(int i = 0, j = array.length - 1; j >= 0; i++, j--){
			tempArray[i] = array[j];
		}
		//��tempArray[]�е�Ԫ�طŵ�array[]��
		for(int i = 0; i <array.length; i++){
			array[i] = tempArray[i];
		}
	}
	
	//����Ԫ������2
	public static void resetArrayOrder2(int[] array){
		//�������ͬһ�������εõ�ԭ��������Ԫ�ؽ���λ��
		//������Ҫ�����������±�i��j��ʼֵΪ0������ĳ���-1
		//��i<���鳤�ȵ�һ�����j�����ҵ������鳤�ȵ�һ��ʱִ�н���
		//���⣬���i��j���ҲҪֹͣ����
		//for(int i = 0, j = array.length - 1; i < array.length/2; i++, j--){
		for(int i = 0, j = array.length - 1; i < j; i++, j--){
			array[i] = array[i] ^ array[j];
			array[j] = array[i] ^ array[j];
			array[i] = array[i] ^ array[j];
		}
	}
	
	//����Ԫ�ز���
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
		int searchResult = -1;//Ĭ�Ϸ���ֵ-1������Ҳ���Ԫ���򷵻�-1
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