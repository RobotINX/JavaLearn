
��������

���µ�10������
   +--+--+--+		
   |  |  |  |			
+--+--+--+--+			
|  |  |  |  |			
+--+--+--+--+			
|  |  |  |
+--+--+--+

һ����ά����a[3][3]������a[0][0]��a[3][3]������
		����i��i>=0,i<=3
		����j��j>=0,j<=3
		��:	(i==3 && j==3)!=true
			(i==0 && j==0)!=true

���ң�
1����a[i][j]��a[i-1][j-1]��a[i-1][j]��a[i-1][j+1]
2����a[i][j]��a[i][j-1]����a[i][j+1]
3����a[i][j]��a[i+1][j-1]��a[i+1][j]��a[i+1][j+1]
�����������ֲ�������
		public int isTable(int i,int j){
			if(i>=0&&i<=3){
				if(j>=0&&j<=3)
					return 1;
				else return 0;
			}
			else return 0;
		}

		
��������ж��Ƿ��Ǳ���ĺ���Ϊ��
		public int isTable(int i,int j){
			if(i>=0&&i<=3){
				if(j>=0&&j<=3){
					if((i==3&&j==3)||(i==0&&j==0))
						return 0;
					else 
						return 1;
				}
				else return 0;
			}
			else return 0;
		}


�������ʾ�����⣬Ҳ���Բο���ͼ1.jpg����

����0~9�����֡�Ҫ���������������ֲ������ڡ�
�����ҡ����¡��ԽǶ������ڣ�

��������ʱ�������ظ����֣�
	1������һ������Ϊ10��һά�������ù�������
	2��ʹ�ñ��������ҵ�ǰ�����Ƿ���ǰ������ֶ�����ͬ
	3���������ͬ������1����ͬ�򷵻�0
	int[] take = new int[10];
	public int isCommon(int count,int num){
		int bool = 0;
		for(int i = 0;i <= count;i++){
			if(take[i] == num){
				bool = 0;
				break;
			}
			else
				bool = 1;
		}
		return bool;
	}
	
��������ʱ��Ҫ�����ڵ����������ڵ����ֲ����ڣ�
	int num = 0;
	public int is









һ���ж����ֿ��ܵ�����������

����д��ʾ������Ŀ��������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�