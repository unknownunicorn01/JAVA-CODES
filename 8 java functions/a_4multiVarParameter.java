import java.util.*;
public class a_4multiVarParameter {
  public static int sumFin(int a,int b){
    int c=a+b;
    return c;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum=sumFin(a,b);
    System.out.println("sum of a and b : "+sum);
    sc.close();
  }
}
