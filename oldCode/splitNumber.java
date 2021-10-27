/*
 *�����ɸ���ֱ�ŵ���ͬ�ĺ��������һ���ж����ֲ�ͬ�ķŷ�
 *number��ʾ�������
 *array��ʾװ��ĺ���
 *index��ʾ���ӵ����
 */
class Main{
	public static void main(String[] args){
		int number = 10;
		int[] array = new int[1000];
		split(number, array, 0);
	}
	
	public static void split(int number, int[] array, int index){
		//���ŵ����û�����ʱ�򣬰�ÿ��������װ�˶��ٸ����ӡ����
		if(number == 0){
			for(int i = 0; i < index; i++)
				System.out.print(array[i] + " ");
			System.out.println();
			return;
		}
		
		//temp��ʾindex�������ж��ٸ�����������еݹ�ַ�
		//������û�����ʱ��ѭ����ֹ
		for(int temp = number; temp > 0; temp--){
			//���������ĺ�����װ��������ǰ��ĺ�����װ��������
			if(index > 0 && temp > array[index-1])
				continue;
			array[index] = temp;
			split(number - temp, array, index+1);
		}
	}
}