/*
	Integer(int value) 
          ����һ���·���� Integer ��������ʾָ���� int ֵ�� 
	Integer(String s) 
          ����һ���·���� Integer ��������ʾ String ������ָʾ�� int ֵ�� 
*/

import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String string = "";
		string = getString(string, 3, 1, 65);
		System.out.println(string);
	}
	
	public static String getString(String string, int m, int n, int o){
		if(n == 1 && m == 1){
			string += (char)(o+1);
		}
		if(n == 1 && m != 1){
			string = getString(string, m-1, n, o);
		}
		else{
			string = "";
		}
		return string;
	}
}