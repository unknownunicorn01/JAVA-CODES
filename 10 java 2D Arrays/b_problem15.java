import java.util.*;
class solution{
  public boolean func(int[][] mat){
    int n = mat.length;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(mat[j][j] == 0 || mat[j][n-1-j] == 0){
          return false;
        }
        if(mat[i][j] != 0 && i != j && i != n-1-j){
          return false;
        }
      }
    }
    return true;
  }
}
public class b_problem15 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    for(int k=0;k<m;k++){
      int n = sc.nextInt();
      int[][] mat = new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          mat[i][j] = sc.nextInt();
        }
      }
      solution obj = new solution();
      System.out.println(obj.func(mat));
    }
    sc.close();
  }
}
