import java.util.*;
public class f_problem21 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int next = 1;
    System.out.println("0\n1");
    int i=0;
    while((n-2)>0){
      next = next+i;
      i=next-i;
      System.out.println(next);
      n--;
    }
    sc.close();
  }
}
