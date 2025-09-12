import java.util.*;
public class a_7combination {
  public static long Comb(int n,int r){
    long n2=1;
    long r2=1;
    long def=1;
    for(int i=1;i<=n;i++){
      n2=n2*i;
    }
    for(int i=1;i<=r;i++){
      r2=r2*i;
    }
    for(int i=1;i<=(n-r);i++){
      def=def*i;
    }
    return n2/(def*r2);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter teh value of n: ");
    int n = sc.nextInt();
    System.out.print("enter teh value of r: ");
    int r = sc.nextInt();
    System.out.println("Combination nCr = "+Comb(n,r));
    sc.close();
  }
}