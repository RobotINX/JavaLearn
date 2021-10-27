class Main{
	public static void main(String[] args){
		int[] array = new int[1000000];
		int a = 257;
		int b = 191;
		int max = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		for(int index = 0; index < a*b; index++){
			for(int i = 0; i <= b; i++){
				for(int j = 0; j <= a; j++){
					if(a*i+b*j==array[index])
						array[index] = 0;
				}
			}
		}
		for(int i = 0; i < a*b; i++){
			if(array[i] != 0 && array[i] > max)
				max = array[i];
		}
		System.out.println(max);
	}
}