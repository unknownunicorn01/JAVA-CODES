import java.util.*;
public class b_problem9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long sum = 0;
    for(long i=1;i<=n;i++){
      if(i%2==1){
        sum = sum + i;
      }
    }
    System.out.println(sum);
    sc.close();
  }
}
