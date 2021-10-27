class addAll{
	public static void main(String args[]){
		int[] array = {1,2,3,4,5};
		int sum = addAll(array,0);
		System.out.println(sum);
	}
	
	public static int addAll(int[] array, int index){
		if (index == array.length-1)
			return array[index];
		else 
			return addAll(array,index+1) + array[index];
	}
}