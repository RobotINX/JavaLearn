/*
	��������
	��1+2+3+...+n��ֵ��
	�����ʽ
	�������һ������n��
	�����ʽ
	���һ�У�����һ����������ʾ1+2+3+...+n��ֵ��
	��������
	4
	�������
	10
	��������
	100
	˵������һЩ������������������������԰�������õ����⡣

	һ�����ύ֮ǰ������Щ��������Ҫ����ͨ�����У����ⲻ�����⼸���������ݶ���ȷ����ĳ��������ȫ��ȷ�ģ�Ǳ�ڵĴ��������Ȼ������ĵ÷ֽϵ͡�

	�������
	5050
	���ݹ�ģ��Լ��
	1 <= n <= 1,000,000,000��
	˵������ע����������ݹ�ģ��

	����ֱ�ӵ��뷨��ֱ��ʹ��һ��ѭ�����ۼӣ�Ȼ���������ݹ�ģ�ܴ�ʱ�����֡��������ķ��������ᵼ�³�ʱ����ʱ����Ҫ���������������������һ�ԣ����ʹ��1000000000��Ϊ��ĳ�������룬��ĳ����ǲ������ڹ涨������涨��ʱ�������г�����

	������һ��Ҫֵ��ע��ĵط��Ǵ𰸵Ĵ�С�����������Ĭ�ϵ�����(int)��Χ�ڣ����ʹ�����������������ᵼ�½������

	�����ʹ��C++��C���Զ���׼��ʹ��printf������������ĸ�ʽ�ַ���Ӧ��д��%I64d�����long long���͵�������
*/
/*
	���ݹ�ģ��ܴ󣬳����������ֵʮ��֮��ļ���ʱ��ͼ�����Դ
	��û�б�İ취
*/
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        long i = Integer.parseInt(strin.readLine());
        long sum = (1+i)*i/2;
        System.out.println(sum);
    }
}
*/
import java.util.Scanner;
class leijia{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		//BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
		//long n = Integer.parseInt(string.readLine());
		long sum = (1+n)*n/2;
		System.out.println(sum);
	}
}