package oldCode;

class wine{
	public static void main(String[] args){
		for(int a = 1; a <= 20; a++){
			for(int b = 1; b < a; b++){
				for(int c = 1; c < b; c++){
					for(int d = 2; d < c; d++){
						//if(wine/a + wine/b + wine/c + wine/d == wine)
						if(b*c*d+a*c*d+a*b*d+a*b*c == a*b*c*d)
							System.out.println(a+" "+b+" "+c+" "+d+" "+0);
					}
				}
			}
		}
	}
}
