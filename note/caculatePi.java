import java.util.Scanner;
class caculatePi{
	public static void main(String args[]){
		for(int time = 0; time <= 10; time++){
			double m = Double.MAX_VALUE;
			double n = 0;
			for(double i = 0; i <= m; i++){
				double x = Math.random();
				double y = Math.random();
				if(x*x + y*y <= 1){
					n++;
				}
			}
			double pi = 4*n/m;
			System.out.println(pi);
		}
	}
}