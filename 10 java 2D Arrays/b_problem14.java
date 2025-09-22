import java.util.*;
class solution{
  public boolean func(int[][] mat){
    int m = mat.length;
    int n = mat[0].length;
    for(int i=1;i<m;i++){
      for(int j=1;j<n;j++){
        if(mat[i][j] != mat[i-1][j-1]){
          return false;
        }
      }
    }
    return true;
  }
}
public class b_problem14 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] mat = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    solution obj = new solution();
    boolean ans = obj.func(mat);
    System.out.println(ans);
    sc.close();
  }
}
