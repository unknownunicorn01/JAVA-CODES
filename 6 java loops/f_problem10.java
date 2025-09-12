import java.util.*;
public class f_problem10 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
    while(n%2==0){
      n = sc.nextInt();
      i++;
    }
    System.out.println(i);
    sc.close();
  }
}
