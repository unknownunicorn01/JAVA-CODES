import java.util.*;
public class a_3parameter {
  public static int factorialFun(int n){
    int num=1;
    for(int i=1;i<=n;i++){
      num=num*i;
    }
    return num;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your number is : "+n);
    System.out.println(factorialFun(n));
    sc.close();
  }
}
