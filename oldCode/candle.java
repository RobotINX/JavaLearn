/* 
��������

ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������

��������������һ����Ϩ��236������

���ʣ����Ӷ����꿪ʼ������party�ģ�

����д����ʼ������party����������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�

*/
/*
	���迪ʼ�������������start
		���ڵ�������end
		��ôһ���������������year = end - start
		����year����һ������candle = start * year + year * (year - 1)/2
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