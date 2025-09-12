import java.util.*;
import java.lang.Math;
public class f_problem23 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos= sc.nextInt();
    int count=0;

    String nstr=String.valueOf(n);
    int pow= (int)Math.pow(10,(nstr.length()));


    if(pos>0){
      count=pos;
    }
    else if(pos<0){
      count=(-1)*pos;
    }
    while(count>0){
      if(pos>0){
        n=n+((n%10)*pow);
        n=n/10;
        count--;
      }
      if(pos<0){
        n=n*10+((n*10)/pow);
        n=n%pow;
        count--;
      }

    }
    // System.out.println(pos);
    System.out.println(n);
    sc.close();
  }
}
