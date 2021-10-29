package oldCode;

class sushu{
	public static void main(String[] args){
		int[] array = new int[1000000];
		int[] result = new int[10000];
		for(int i = 0; i < array.length; i++){
			array[i] = i + 1;
		}
		
		for(int number = 2; number < array.length / 2; number++){
			for(int index = 0; index < array.length; index++){
				array[index] = array[index] % number == 0 ? 1 : array[index];
			}
		}
		/* 
		for(int index = 0; index < array.length; index++){
			for(int number = 2; number <= array[index] / 2; number++){
				array[index] = array[index] % number == 0 ? 1 : array[index];
			}
		}
		 */
		 /* 
		for(int i = 0, index = 0; i < array.length; i++){
			if(array[i] != 1){
				result[index] = array[i];
				index++;
			}
		}
		 */
		for(int index = 0; index < result.length; index++){
			if(result[index] != 1 && result[index] != 0)
				System.out.println("result["+index+"]="+result[index]);
		}
	}
}