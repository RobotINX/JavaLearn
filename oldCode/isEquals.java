class isEquals{
	public static void main(String args[]){
		String string1 = "2134";
		String string2 = "222";
		boolean bool = isEquals(string1, string2, 0);
		System.out.println(bool);
	}
	
	public static boolean isEquals(String string1, String string2, int index){
		if (index == string1.length() && index == string2.length())
			return true;
		else if (string1.charAt(index) == string2.charAt(index))
			return isEquals(string1, string2, index+1);
		else 
			return false;
	}
}