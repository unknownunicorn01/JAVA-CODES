import java.util.*;
public class a_2D_array2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] mat = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(mat));
    sc.close();
  }
}