class test2{
	public static void setYanghuiTriangle(int[][] array){
		for(int i = 1; i < array.length; i++){
			for(int j = 1; j < array[i].length; j++){
				if(i == j || j == 1){
					array[i-1][j-1] = 1;
				}
				else{
					array[i-1][j-1] = array[i-2][j-1] + array[i-2][j-2];
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[][] yanghuiTriangle = new int[100][100];
		setYanghuiTriangle(yanghuiTriangle);
		printArray2D(yanghuiTriangle);
	}
}