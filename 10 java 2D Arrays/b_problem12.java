import java.util.*;
public class b_problem12 {
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
    int i =0;
    int j =0;
    int turn = 0;
    while (true) {
        turn = (turn+mat[i][j])%4;
        if(turn == 0) j++;
        else if(turn == 1) i++;
        else if(turn == 2) j--;
        else if(turn == 3) i--;
        
        if(i<0){ i++; break;}
        if(i==m){ i--; break;}
        if(j<0){ j++; break;}
        if(j==n){ j--; break;}
    }
    System.out.println(i+" "+j);
    sc.close();
  }
}
