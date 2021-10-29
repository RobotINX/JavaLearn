package oldCode;

class Main{
	public static void main(String[] args){
		int m = 3;
		int n = 1;
		int result = numberCombine(m, n);
		System.out.println(result);
	}
	
	public static int numberCombine(int m, int n){
		if(m == 0 || n == 0)
			return 1;
		else
			return numberCombine(m-1,n) + numberCombine(m,n-1);
	}
}