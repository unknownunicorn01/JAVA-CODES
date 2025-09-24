//AIM IS TO PRINT THE ROW OF THE PASCLES TRIANGLE
import java.util.*;
public class b_problem3_2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int res = 1;
    System.out.print("enter the row number :");
    int n = sc.nextInt();
    System.out.println(res);
    n++;
    for(int i=0;i<n;i++){
      res = res * (n-i);
      res = res/(i+1);
      System.out.println(res);
    }
    sc.close();
  }
}
