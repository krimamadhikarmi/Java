package lab;

public class SecondLargest {
    public static void main(String[] args) throws Exception{
        System.out.println(secondLargest(new int[] {1}));
        System.out.println(secondLargest(new int[] {2,2,2}));
        System.out.println(secondLargest(new int[] {1,2,3,4}));
    }
    static int secondLargest(int[] number){
       if(number==null|| number.length<2){
        return -1;
       }
       int largest=-1;
       int secondlargest=-1;
       for (int num: number){
        if( num>largest){
            secondlargest=largest;
            largest=num;
           }else if(num > secondlargest && num != largest){
            secondlargest=num;
           }
       }
       return secondlargest ==-1 ?-1:secondlargest;
      
    }

}
