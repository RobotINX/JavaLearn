package note;

import java.util.Scanner;
class Main{
	static int moveTime = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int plate = input.nextInt();
		char a = 'A';
		char b = 'B';
		char c = 'C';
		input.close();
		hanoi(plate,a,b,c);
		moveTime += 1;
		System.out.println(moveTime-1);
	}
	
	//递归函数hanoi
	//将plate个碟子从a借助b移动到c
	public static void hanoi(int plate, char a, char b, char c){
		//当只有一个碟子的时候，直接把碟子从a移到c
		if(plate == 1){
			System.out.println(a + "-->" + c);
			moveTime += 1;
		}
		else{
			hanoi(plate-1, a, c, b);//否则，将plate-1个碟子从a借助b移动到c
			System.out.println(a + "-->" + c);
			moveTime += 1;
			hanoi(plate-1, b, a, c);//最后将plate-1个碟子从b借助a移动到c
		}
	}
}