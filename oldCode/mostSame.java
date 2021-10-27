class mostSame{
	public static void main(String[] args){
		String string1 = "asdf";
		String string2 = "asaf";
		int mostSame = mostSame(string1,string2);
		System.out.println(mostSame);
	}
	
	public static int mostSame(String string1, String string2){
		if(string1.length() == 0 || string2.length() == 0)
			return 0;
		if(string1.charAt(0) == string2.charAt(0))
			return mostSame(string1.substring(1), string2.substring(1)) + 1;
		else 
			return Math.max(mostSame(string1.substring(1), string2), mostSame(string2, string1.substring(1)));
			
	}
	
	
}