class pailie{
	public static void main(String[] args){  
		String string = "ABC";
		char[] array = string.toCharArray();
		pailie(array, 0);  
	}
	
	public static void pailie(char[] array, int start){    
		if(start == array.length)
			print(array);
		else  
			for(int i = start; i < array.length; i++){  
				exchange(array,start,i);  //  交换元素  
				pailie(array,start+1);  //交换后，再进行全排列算法  
				exchange(array,start,i);  //还原成原来的数组，便于下一次的全排列  
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