package oldCode;

class numberCombine{
	public static void main(String[] args){
		int m = 3;
		int n = 1;
		int result = numberCombinef(m, n);
		System.out.println(result);
	}
	
	public static int numberCombinef(int m, int n){
		if(m == 0 || n == 0)
			return 1;
		else
			return numberCombinef(m-1,n) + numberCombinef(m,n-1);
	}
}