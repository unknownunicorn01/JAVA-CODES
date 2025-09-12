import java.util.*;
public class a_12ZeroCheck {
  public static boolean isZero(int n){
    n=n/10;
    if(n%10==0){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isZero(n)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
