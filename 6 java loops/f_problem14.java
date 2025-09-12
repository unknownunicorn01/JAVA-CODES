import java.util.*;
public class f_problem14 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mul = 1;
    int sum = 0;
    while(n!=0){
      mul=mul*(n%10);
      sum = sum+(n%10);
      n=n/10;
    }
    System.out.println(mul-sum);
    sc.close();
  }
}
