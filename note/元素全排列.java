/* 
	public class Main {   
    /** 
     * ���ݹ顿��n��Ԫ�ص�ȫ���� 
     * abc acb bac bca cab cba 
     * @param args 
     */  
    public static void f(char data[],int k){   //��ǰ��ע��k   
        if(k==data.length){  
            for(int i=0;i<data.length;i++){  
                System.out.print(data[i]+" ");  
            } 
            System.out.println();  
        }
        //�ѵ�һ��Ԫ�ط���������Ԫ���ٽ���ȫ����  
        //�����Ԫ�ز��ܼ򵥷Ź������Ḳ�ǣ����������ɡ�  
        for(int i=k;i<data.length;i++){   //ѭ���еĵݹ���ǳ���  
        //������ÿ��Ԫ�غͺ����Ԫ�ؽ��н�����Ȼ��ݹ�      
            {char temp=data[k];  //��̽  
			data[k]=data[i];  
            data[i]=temp;}  
            f(data,k+1);  
/*          {char temp=data[k];   //�������˴�����Ҫ���� 
                data[k]=data[i]; 
                data[i]=temp;}*/  
        }
    }  
  
  
      
    public static void main(String[] args) {  
        //��һ��String��Ϊchar���飬��ӡ����������ʽ  
        char data[]= "ABC".toCharArray();    //ת��Ϊchar���������  
          
        f(data,0);    //��data����  
    }  
}  
*/




import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] array = {1,2,3,4};
		int n = array.length;
		arrange(array,array.length);
	}
	
	//����Ԫ����ͬһ�����
	public static void printArrayElement(int[] array){
		for(int i = 0; i < array.length; i++){
			if(i == array.length-1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i] + ",");
			}
		}
	}
	
	public static void swap(int[] array, int m, int n){
		array[m] = array[m] ^ array[n];
		array[n] = array[m] ^ array[n];
		array[m] = array[m] ^ array[n];
	}
	
	public static void arrange(int[] array, int n){
		if(n == 1)
			printArrayElement(array);
		else{
			for(int i = 0; i < n; i++){
				arrange(array,n-1);
				swap(array,n-1,n-2);
			}
		}
	}
}