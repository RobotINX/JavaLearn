import java.util.Scanner;
class Main {
    public static String hexToOct(String hexStr){
        int number = 0;
        hexStr = hexStr.toUpperCase();//�������ʮ��������ת���ɴ�д��ĸ
        char[] hexArray = hexStr.toCharArray();
        int[] numInt = new int[hexArray.length];
		
	//���ַ������е��ַ�ת��������
        for(int i = 0; i <hexArray.length; i++){
            if(hexArray[i]<='F' && hexArray[i]>='A'){//������ַ�����ôת����ʮ��������10-15
                numInt[i] = hexArray[i] - 55;
            }
            else {//����������򲻱䣬����Ҫת����ASCII��������ֶ�Ӧ�ı���
                numInt[i] = hexArray[i]-48;
            }
        }
		
        //�ѻ�ȡ��������ת����ʮ��������
        for(int i = 0; i < hexArray.length; i++){
            int digit = hexArray.length - i -1;
            number += numInt[i]*Math.pow(16, digit);
        }
	System.out.println(number);
		
	//�ѵõ���ʮ��������ת���ɰ˽�������
        String octStr = "";
        do{
            octStr += number % 8;
            number /= 8;
        }while(number>0);
        System.out.println(octStr);
        
        //���ַ������е�Ԫ�ص���
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
        System.out.println(hexToOct(hexStr));
    }
}

