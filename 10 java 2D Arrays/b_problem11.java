import java.util.*;
public class b_problem11 {
  public static void main(String[] arge){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    int[][] arr = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int idx1=0;
    int idx2=0; 
    while(idx1 != n || idx2 != m){
      for(int i=idx1;i<n;i++){
        System.out.println(arr[0][i]);
      }
      for(int j=idx2;j<m-1;j++){
        System.out.println(arr[j+1][m-1]);
      }
      for(int i=idx1; i<n-1;i++){
        System.out.println(arr[n-1][n-i-1]);
      }
      for(int j=idx2; j<m-1 ;j++){
        System.out.println(arr[0][m-2-j]);
      }
      idx1++;
      idx2++;
      m--;
      n--;
    }
    sc.close();
  }
}
