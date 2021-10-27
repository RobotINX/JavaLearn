class pailie{
	public static void main(String[] args){
		String string = "ABCD";
		char[] array = string.toCharArray();
		pailie(array, 0);
	}
	
	public static void pailie(char[] array, int index){
		if(index == array.length)
			print(array);
		else
			for(int i = index; i < array.length; i++){
				exchange(array, index, i);
				pailie(array, index+1);
				exchange(array, index, i);
			}
	}
	
	public static void exchange(char[] array, int index, int i){
		char temp = array[index];
		array[index] = array[i];
		array[i] = temp;
	}
	
	public static void print(char[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
}