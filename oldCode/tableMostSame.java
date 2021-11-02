package oldCode;

import java.util.Scanner;
class tableMostSame{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String string1 = input.next();
		String string2 = input.next();
		input.close();
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();
		int mostSame = mostSame(array1, array2);
		System.out.println(mostSame);
	}
	
	public static int mostSame(char[] array1, char[] array2){
		int[][] table = new int[array1.length][array2.length];
		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j < array2.length; j++){
				if(i == 0 || j== 0){
					if(array1[i] == array2[j])
						table[i][j] = 1;
					else
						table[i][j] = 0;
				}
				else{
					if(array1[i] == array2[j])
						table[i][j] = table[i-1][j-1] + 1;
				}
			}
		}
		
		int max = 0;
		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j < array2.length; j++){
				max = max > table[i][j] ? max : table[i][j];
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
		
		return max;
	}
}