class Main{
	public static void main(String[] args){
		final int N = 1000*1000;
		int count = 0;
		
		for(int i = 0; i < N; i++){
			int[] array = new int[365];
			for(int j = 0; j < 30; j++){
				int day = (int)(Math.random()*365);
				array[day] += 1;
				if(array[day] == 3){
					count++;
					break;
				}
			}
		}
		double p = (double)count / N;
		System.out.println(p);
	}
}