import java.util.*;
public class b_problem16 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        mat[i][j] = sc.nextInt();
      }
    } 
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(mat[j][n-1-i+j]+" ");
      }
    }
    for(int i=1;i<n;i++){
      for(int j=i;j<n;j++){
        System.out.print(mat[j][j-i]+" ");
      }
    }
    sc.close();
  }  
}

/*
  1 2 3 1
  4 5 6 1
  7 8 9 1
  1 1 1 1
 */