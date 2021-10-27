/* 
	public class Main {   
    /** 
     * 【递归】求n个元素的全排列 
     * abc acb bac bca cab cba 
     * @param args 
     */  
    public static void f(char data[],int k){   //当前关注点k   
        if(k==data.length){  
            for(int i=0;i<data.length;i++){  
                System.out.print(data[i]+" ");  
            } 
            System.out.println();  
        }
        //把第一个元素放这里，后面的元素再进行全排列  
        //后面的元素不能简单放过来：会覆盖！！交换即可。  
        for(int i=k;i<data.length;i++){   //循环中的递归就是出口  
        //将数组每个元素和后面的元素进行交换，然后递归      
            {char temp=data[k];  //试探  
			data[k]=data[i];  
            data[i]=temp;}  
            f(data,k+1);  
/*          {char temp=data[k];   //！！：此处不需要回溯 
                data[k]=data[i]; 
                data[i]=temp;}*/  
        }
    }  
  
  
      
    public static void main(String[] args) {  
        //将一个String改为char数组，打印所有排列形式  
        char data[]= "ABC".toCharArray();    //转化为char型数组语句  
          
        f(data,0);    //传data数组  
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
	
	//所有元素在同一行输出
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