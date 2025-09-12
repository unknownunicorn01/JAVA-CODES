import java.util.*;
public class a_6combination {
  public static int Factorial(int num){
    int n=1;
    for(int i=1;i<=num;i++){
      n=n*i;
    }
    return n;

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = sc.nextInt();
    System.out.println("Enter teh value of r: ");
    int r = sc.nextInt();
    int comb=Factorial(n)/((Factorial(n-r)*Factorial(r)));
    System.out.println("combination: "+comb);
    sc.close();
  }
}
