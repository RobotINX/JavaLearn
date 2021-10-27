public class test{
    public static void sum(int... numbers){
        System.out.println(numbers);
        for(int i : numbers){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        sum(1,2,2,3,1);
    }
    
}