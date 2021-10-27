class Main{
	public static void main(String[] args){
		int a = 4;
		int b = 7;
		int gcd = gcd(a,b);
		int lcm = lcm(a,b);
		//System.out.println(gcd);
		System.out.println(lcm);
	}
	
	public static int lcm(int a, int b){
		int gcd = gcd(a,b);
		return a*b/gcd(a,b);//最小公倍数为两数相乘后除以他们的最大公约数
	}
	
	public static int gcd(int a, int b){
		if(a%b == 0)
			return b;
		else
			return gcd(b,a%b);
	}
}