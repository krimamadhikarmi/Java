package lab;

public class jaggedArray {
    public static void main(String[] args) throws Exception{
      int [][]matrix=new int[][] {{1,2,3},{4,5,6},{8,9}};
      for(int i=0; i<matrix.length;i++){
        int sum = 0;
        for(int j=0; j<matrix[i].length; j++){
            System.out.println(matrix[i][j]+"");
            sum+= matrix[i][j];
        }
        System.out.println("Sum of row"+(i+1)+":"+sum);
      }
    }
}
