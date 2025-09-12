import java.util.*;
public class f_problem15 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int num=0;
    int count=0;
    while(n!=0){
      num = num*10 + (n%10);
      n=n/10;
      count++;
    }
    while(count>0){
      System.out.println(num%10);
      num=num/10;
      count--;
    }
    sc.close();

  }
}
