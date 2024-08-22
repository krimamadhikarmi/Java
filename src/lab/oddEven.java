package lab;

public class oddEven {
    public static void main(String[] args) throws Exception{
        System.out.println(getValue(new int[]{1,2,3,4,5,6,7,8,9,1}));
    }
    static int getValue(int[] a){
        int sumEven=0;
        int sumOdd=0;

        for (int i=0; i<a.length; i++){
            if(a[i]%2==0){
                sumEven +=a[i];
            }
            else{
                sumOdd +=a[i];
            }
        }
        return sumOdd-sumEven;
    }
}
