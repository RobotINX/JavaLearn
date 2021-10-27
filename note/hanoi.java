import java.util.Scanner;
class Main{
	static int moveTime = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int plate = input.nextInt();
		char a = 'A';
		char b = 'B';
		char c = 'C';
		hanoi(plate,a,b,c);
		moveTime += 1;
		System.out.println(moveTime-1);
	}
	
	//�ݹ麯��hanoi
	//��plate�����Ӵ�a����b�ƶ���c
	public static void hanoi(int plate, char a, char b, char c){
		//��ֻ��һ�����ӵ�ʱ��ֱ�Ӱѵ��Ӵ�a�Ƶ�c
		if(plate == 1){
			System.out.println(a + "-->" + c);
			moveTime += 1;
		}
		else{
			hanoi(plate-1, a, c, b);//���򣬽�plate-1�����Ӵ�a����b�ƶ���c
			System.out.println(a + "-->" + c);
			moveTime += 1;
			hanoi(plate-1, b, a, c);//���plate-1�����Ӵ�b����a�ƶ���c
		}
	}
}