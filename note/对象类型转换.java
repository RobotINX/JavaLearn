package note;

/*
	Integer(int value) 
          构造一个新分配的 Integer 对象，它表示指定的 int 值。 
	Integer(String s) 
          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。 
*/

import java.util.Scanner;
class 对象类型转换{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		input.close();
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