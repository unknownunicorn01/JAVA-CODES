import java.util.*;
public class f_problem11 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num1=1,num2=2;
    while(n>0 && num2<=n){
      System.out.print(num1+" "+num2+" ");
      num1+=4;
      num2+=4;
    }
    if(num1==n){
      System.out.println(num1);
    }
    if(num2==n){
      System.out.println(num2);
    }
    sc.close();
  }
}
