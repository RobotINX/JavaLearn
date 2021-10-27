class zuhe{
	public static void main(String args[]){
		int way = zuhe(3, 2);
		System.out.println(way);
	}
	
	public static int zuhe(int m, int n){
		if (m < n)
			return 0;
		else if(n == 1)
			return m;
		else if(m == n)
			return 1;
		else
			return zuhe(m-1, n-1) + zuhe(m-1, n);
	}
}