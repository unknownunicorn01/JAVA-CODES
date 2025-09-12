import java.util.*;
public class a_10loopSumFun {
  static int sumFun(int a){
    for(int i=1;i<=5;i++){
      a++;
    }
    return a;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = sumFun(n);
    System.out.println(sum);
    sc.close();
  }
}
