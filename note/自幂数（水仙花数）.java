import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//int number = input.nextInt();
		int[] digit = new int[5];//�����õ�ÿһλ����
		int count = 0;//��¼����
		for(int number = 10000; number <= 99999; number++){
			int result = 0;
			//��ȡÿһλ����
			for(int i = 0; i < digit.length; i++){
				digit[i] = number / (int)Math.pow(10,i) % 10;
			}
			//����ÿһλ���ֵĴη���
			for(int i = 0; i < digit.length; i++){
				result = result + (int)Math.pow(digit[i],digit.length);
			}
			//�ж��Ǵη����Ƿ����ԭ����
			if(result == number){
				System.out.println(number);
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}