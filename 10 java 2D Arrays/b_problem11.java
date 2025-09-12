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
    while(n>=0 || m >= 0 ){
      for(int i=0;i<n-1;i++){
        System.out.print(arr[0][i]+" ");
      }
      for(int i=0;i<m;i++){
        System.out.print(arr[i][n-1]+" ");
      }
      if(n!=1){
        for(int i=n-2;i>=0;i--){
          System.out.print(arr[m-1][i]+" ");
        }
        for(int i=m-2;i>0;i--){
          System.out.print(arr[i][0]+" ");
        }
      }
      m--;
      n--;
    }
    sc.close();
  }
}
