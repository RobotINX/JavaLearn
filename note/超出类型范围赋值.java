package note;

/*
	byte b = 130;��û������?��������ø�ֵ��ȷ��������ô��?����Ƕ�����?
	
	��ϰ��byte b = (byte)300;
*/
class DataTypeDemo7 {
	public static void main(String[] args) {
		//��Ϊbyte�ķ�Χ�ǣ�-128��127��
		//��130���ڴ˷�Χ�ڣ����Ա�����
		//byte b = 130; 
		
		//���ǿ���ʹ��ǿ������ת��
		byte b = (byte) 130;
		
		//����Ƕ�����?
		System.out.println(b);
	}
}
/*
	�������̣�
		����Ҫ��֪�������ʲô����Ӧ��֪������ν��м���ġ�
		��������֪������������ݵ����㶼�ǲ�����еġ�
		��Ҫ�õ����룬����Ҫ��������ݵĶ����ơ�
		
		A:��ȡ130������ݵĶ����ơ�
			00000000 00000000 00000000 10000010
			����130��ԭ�룬Ҳ�Ƿ��룬���ǲ��롣
		B:����ȡ�������س�byte���͵��ˡ�
			10000010 
			�������ǲ��롣
		C:��֪������ԭ�롣
					����λ		��ֵλ
			���룺	1			0000010
			
			���룺	1			0000001
			
			ԭ�룺	1			1111110
*/
