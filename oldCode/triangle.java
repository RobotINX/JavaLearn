class Main{
	public static void main(String[] args){
		int m = 6;
		int n = 3;
		int result = triangle(m,n);
		System.out.println(result);
	}
	
	public static int triangle(int m, int n){
		if(n > m)
			return 0;
		else if(n == 1)
			return 1;
		else if(m - n == 0)
			return 1;
		else
			return triangle(m-1, n-1) + triangle(m-1, n);
	}
}