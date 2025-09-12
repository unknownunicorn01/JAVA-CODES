import java.util.*;
public class a_2D_array1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] mat = new int[n][m];
    System.out.println(Arrays.deepToString(mat)); // this will print 0 at all place in matrix because me have not gave them values inside and 0 is by default value
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    for(int row=0;row<n;row++){
      for(int col=0;col<m;col++){
        System.out.print(mat[row][col]+ " ");
      }
      System.out.println();
    }  // will have more time complexity but will print like real matrix
    sc.close();
  }
}