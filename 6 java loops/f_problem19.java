import java.util.*;
public class f_problem19 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    if(n==0){
      System.out.println("1");
    }
    else{
      System.out.println(fact);
    }
    sc.close();
  }
}
