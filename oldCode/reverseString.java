package oldCode;

class reverseString{
	public static void main(String[] args){
		String string = "ABCDEFG";
		String result = reverseStrings(string);
		System.out.println(result);
	}
	
	public static String reverseStrings(String string){
		if(string == null || string.length() < 2)
			return string;
		else
			return reverseStrings(string.substring(1)) + string.charAt(0);
	}
}