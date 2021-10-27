class Main{
	public static void main(String[] args){
		String string = "ABCDEFG";
		String result = reverseString(string);
		System.out.println(result);
	}
	
	public static String reverseString(String string){
		if(string == null || string.length() < 2)
			return string;
		else
			return reverseString(string.substring(1)) + string.charAt(0);
	}
}