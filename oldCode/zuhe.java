package oldCode;

class zuhe{
	public static void main(String args[]){
		int way = zuhes(3, 2);
		System.out.println(way);
	}
	
	public static int zuhes(int m, int n){
		if (m < n)
			return 0;
		else if(n == 1)
			return m;
		else if(m == n)
			return 1;
		else
			return zuhes(m-1, n-1) + zuhes(m-1, n);
	}
}