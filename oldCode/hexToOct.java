package oldCode;

import java.util.Scanner;
class hexToOct {
    public static String hexToOctf(String hexStr){
        int number = 0;
        hexStr = hexStr.toUpperCase();//把输入的十六进制数转换成大写字母
        char[] hexArray = hexStr.toCharArray();
        int[] numInt = new int[hexArray.length];
		
	//把字符数组中的字符转换成数字
        for(int i = 0; i <hexArray.length; i++){
            if(hexArray[i]<='F' && hexArray[i]>='A'){//如果是字符，那么转换成十进制数字10-15
                numInt[i] = hexArray[i] - 55;
            }
            else {//如果是数字则不变，但是要转换成ASCII码表中数字对应的编码
                numInt[i] = hexArray[i]-48;
            }
        }
		
        //把获取到的数组转换成十进制数字
        for(int i = 0; i < hexArray.length; i++){
            int digit = hexArray.length - i -1;
            number += numInt[i]*Math.pow(16, digit);
        }
	System.out.println(number);
		
	//把得到的十进制数字转换成八进制数字
        String octStr = "";
        do{
            octStr += number % 8;
            number /= 8;
        }while(number>0);
        System.out.println(octStr);
        
        //把字符数组中的元素倒序
        char[] octChar = octStr.toCharArray();
        for(int i = 0; i < octChar.length/2; i++){
            int j = octChar.length-i-1;
            char temp = octChar[i];
            octChar[i] = octChar[j];
            octChar[j] = temp;
        }
        octStr = "";
        for(int i = 0; i<octChar.length;i++){
            octStr += octChar[i];
        }
        return octStr;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String hexStr = input.next();
        input.close();
        System.out.println(hexToOctf(hexStr));
    }
}

