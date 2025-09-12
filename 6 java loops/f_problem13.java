import java.util.*;
public class f_problem13 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    while(n!=0){
      sum=sum+(n%10);
      n=n/10;  //because we devided it by 10 so it will remove the last value from the number
    }
    System.out.println(sum);
    sc.close();
  }
}
