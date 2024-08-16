public class matrix {
    public static void main(String[] args)throws Exception{
        int matrix[][]=new int [][]{{1,2,3},{4,5,6},{4,4,6}};
        for (int i =0;i<matrix.length;i++){
            for (int j=0; j<matrix.length;j++){
                System.out.println(matrix[i][j]+"");
            }
        }
        System.out.println();
    }
}
