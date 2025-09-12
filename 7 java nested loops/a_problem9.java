import java.util.*;
public class a_problem9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    
    int count = m;
    while(count>0){
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        if(i<=((n+1)/2)){
          for(int j=(n-1)/2;j>=i;j--){
            System.out.print("  ");
          }
          for(int j=1;j<=(i*2)-1;j++){
            System.out.print("* ");
          }
          System.out.println();
        }
        if(i>((n+1)/2)){
          for(int j=1;j<=(i-(n+1)/2);j++){
            System.out.print("  ");
          }
          for(int j=(n-1);j>=(i-(n+1)/2)*2;j--){
            System.out.print("* ");
          }
          System.out.println();
        }
      }
      count--;
    }
    sc.close();
  }
}
