import java.util.*;
public class b_problem8 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int black =0;
    int white =0;
    int turn = 0;
    for(int i=0;i<n;i++){
      if(n%2==0 && i != 0){
        if(turn == 0){
          turn =1;
        }
        else if(turn == 1){
          turn =0;
        }
      }
      for(int j=0;j<n;j++){
        if(turn==0){
          black = black + arr[i][j];
          turn = 1;
        }
        else{
          white = white + arr[i][j];
          turn = 0;
        }
      }
    }
    System.out.println("black = "+black);
    System.out.println("white = "+white);
    sc.close();
  }
}
