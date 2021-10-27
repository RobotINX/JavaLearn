import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		String string = "";
		System.out.println(combo(string,m,n));
	}
	
	//m个球里取n个球
	public static String combo(String string, int m, int n){
		if(n == 1){
			string += (char)('A'+1);
		}
		for(int i = 0; i < m; i++){
			string =  combo(string, m-1, n-1);
		}
		return string;
	}
}