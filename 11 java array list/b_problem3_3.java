import java.util.*;
public class b_problem3_3 {
  public static void pascals(int n){
    int res = 1;
    for(int i=0;i<n;i++){
      System.out.print(res+" ");
      for(int j=0;j<i;j++){
        res = res * (i-j);
        res = res/(j+1);
        System.out.print(res+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pascals(n);
    sc.close();
  }
}
