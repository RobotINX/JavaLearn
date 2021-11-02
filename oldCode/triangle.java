package oldCode;

class triangle{
	public static void main(String[] args){
		int m = 6;
		int n = 3;
		int result = isTriangle(m,n);
		System.out.println(result);
	}
	
	public static int isTriangle(int m, int n){
		if(n > m)
			return 0;
		else if(n == 1)
			return 1;
		else if(m - n == 0)
			return 1;
		else
			return isTriangle(m-1, n-1) + isTriangle(m-1, n);
	}
}