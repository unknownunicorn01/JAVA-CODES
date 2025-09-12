import java.util.*;
public class b_problem2 {
  public static void mian(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number from which you want to print: ");
    int n = sc.nextInt();
    for(int i=n; i>=1; i--){
      System.out.print(i+" ");
    }
    sc.close();
  }
}
