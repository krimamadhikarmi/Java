package lab;

public class oddEven {
    public static void main(String[] args) throws Exception{
        System.out.println(getValue(new int[]{1,2,3,4,5,6,7,8,9,1}));
        System.out.println(getValue(new int[]{1}));
        System.out.println(getValue(new int[]{2,4,6}));
        System.out.println(getValue(new int[]{1,1,6,7,9,0}));
        System.out.println(getValue(new int[]{2,4,5,3,2}));

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
