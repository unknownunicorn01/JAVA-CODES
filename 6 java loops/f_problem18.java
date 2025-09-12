import java.util.*;
public class f_problem18 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isprime=false;
    for(int i=2;i<n;i++){
      if(n%i==0){
        // System.out.println(n+"is not a prime number.");
        isprime=false;
        break;
      }
      else{
        isprime=true;
      }
    }
    if(n==1){
      System.out.println(n+ " is not a prime number");
    }
    else{
      if(isprime || n==2){
        System.out.println(n+" is a prime number");
      }
      else{
        System.out.println(n+" is not a primte number");
      }
    }
    sc.close();
  }
}
