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
				exchange(array,start,i);  //  ����Ԫ��  
				pailie(array,start+1);  //�������ٽ���ȫ�����㷨  
				exchange(array,start,i);  //��ԭ��ԭ�������飬������һ�ε�ȫ����  
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