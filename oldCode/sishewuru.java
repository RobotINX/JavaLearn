import java.util.Scanner;
class sishewuru{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i <= 10; i++){
			double number = 3.141592653654;
			int digit = input.nextInt();
			double result = Math.round(number*Math.pow(10,digit))/Math.pow(10,digit);
			System.out.println(number);
			System.out.println(result);
			System.out.println("-------------------------------");
		}
	}
}