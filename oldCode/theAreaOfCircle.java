/*
	��������
	����Բ�İ뾶r����Բ�������
	�����ʽ
	�������һ������r����ʾԲ�İ뾶��
	�����ʽ
	���һ�У�����һ��ʵ�����������뱣��С�����7λ����ʾԲ�������
	˵�����ڱ����У�������һ�����������������һ��ʵ����

	����ʵ����������⣬��һ�������ʵ�������Ҫ�󣬱��籾����Ҫ����С�����7λ������ĳ�������ϸ�����7λС�������������߹��ٵ�С��λ�����ǲ��еģ����ᱻ��Ϊ����

	ʵ��������������û���ر�˵�������붼�ǰ�����������С�

	��������
	4
	�������
	50.2654825
	���ݹ�ģ��Լ��
	1 <= r <= 10000��
	��ʾ
	����Ծ���Ҫ��ϸߣ���ע��е�ֵӦ��ȡ�Ͼ�ȷ��ֵ�������ʹ�ó�������ʾ�У�����PI=3.14159265358979323��Ҳ����ʹ����ѧ��ʽ����У�����PI=atan(1.0)*4��
*/
/*
	�ؼ��㣺����������λС��
	�뾶r��int
	���s��double
	����PI��3.14159265358979323
	�������뷽����
		1��temp=s*100000000���Ƚ�����Ŵ�100000000
		2��mod=temp%10����Ŵ�100000000���λ���Ƕ���
		3��if(mod>5&&mod<=9)
				temp=temp/10+1;
				result=temp/10000000;
		4��if(mod<=4&&mod>=0)
				temp=temp/10;
				result=temp/10000000;
*/
import java.util.Scanner;
import java.math.BigDecimal;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159265358979323;
		int r = input.nextInt();
		double area = PI * r * r;;
		//System.out.println("area="+area);
		double resultRound = Math.round(area*Math.pow(10,7))/Math.pow(10,7);
		//System.out.println("resultRound="+resultRound);
		BigDecimal resultBigDecimal = new BigDecimal(resultRound);
		System.out.println("resultBigDecimal="+resultBigDecimal);
		
		BigDecimal  bg = new BigDecimal(bf.readLine());
		BigDecimal value = bg.multiply(bg.multiply(new BigDecimal(Math.PI))).setScale(7,BigDecimal.ROUND_HALF_UP);
	}
}