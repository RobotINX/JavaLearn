package note;

class 二分搜索法{
	//二分搜索法查找元素
	public static int BinarySearch(int[] array, int x){
		int left = 0;
		int right = array.length - 1;
		while(left <= right){
			int middle = (left+right)/2;
			if(x == array[middle])
				return middle;
			if(x < array[middle])
				right = middle - 1;
			if(x > array[middle])
				left = middle + 1;
		}
		return -1;
	}
	
	//给数组中的每一个元素随机赋值
	public static void setRandomValue(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}
	}
	
	//将数组中的元素按照从小到大的顺序重新排列
	public static void ResetArraySmallToBig(int[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]){
					array[i] = array[i] ^ array[j];
					array[j] = array[i] ^ array[j];
					array[i] = array[i] ^ array[j];
				}
			}
		}
	}
	
	public static void main(String args[]){
		int[] array = new int[50];
		setRandomValue(array);
		ResetArraySmallToBig(array);
		int point = BinarySearch(array, 50);
		if(point == -1)
			System.out.println(point);
		else{
			System.out.println(point);
			System.out.println(array[point]);
		}
	}
}