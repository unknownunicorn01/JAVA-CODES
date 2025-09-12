import java.util.*;
public class f_problem12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ch = "";
    while(n!=0){
      ch=ch+(n%10);
      n=n/10;
    }
    System.out.print(ch);
    sc.close();
  }
}
