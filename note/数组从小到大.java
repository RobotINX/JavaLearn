/* 
BASIC-13������ϰ �������� ?
ʱ�����ƣ�1.0s ? �ڴ����ƣ�512.0MB
�ؼ��֣����� ����
��������
��������һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
�����ʽ
������һ��Ϊһ������n��
�����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
�����ʽ
�������һ�У�����С�����˳��������������С�
��������
5
8 3 6 4 9
�������
3 4 6 8 9
*/
import java.util.Scanner;
class Main{

	//���ÿһ�������е�ÿһ���ַ�
	public static void PrintArrayElement(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//���ַ����е�Ԫ��ת��������
	public static void StringToArray(String[] arrayString, int[] arrayInt){
		for(int i = 0; i < arrayString.length; i++){
			arrayInt[i] = Integer.parseInt(arrayString[i]);
		}
	}
	
	//�������е�Ԫ�ذ��մ�С�����˳����������
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
		String[] arrayString = string.split(" ");
		int[] arrayInt = new int[arrayLength];
		StringToArray(arrayString,arrayInt);
		//PrintArrayElement(arrayInt);
		ResetArrayBigToSmall(arrayInt);
		PrintArrayElement(arrayInt);
    }
}