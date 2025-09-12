import java.util.*;
public class a_problem13 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long m = sc.nextLong();
    long n = sc.nextLong();
    long n2;
    long cube;
    long sum=0;
    long po=0;
    for(long i=m;i<=n;i++){
      n2=i;
      sum=0;
      po=0;
      while(n2>0){
        po++;
        n2=n2/10;
        // System.out.println(po);
      }
      for(n2=i;n2>0;n2=n2/10){
        // System.out.println(n2);
        cube=n2%10;
        cube=(long)Math.pow(cube,po);  //we need to write int because power function always return double
        sum = sum + cube;
      }
      // System.out.println(sum+" "+i);
      if(i==sum){
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}


