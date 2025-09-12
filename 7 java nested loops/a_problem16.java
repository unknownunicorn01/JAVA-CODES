import java.util.*;
public class a_problem16{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    int next=1;
    System.out.println("0");
    for(int i=2;i<=n;i++){
      for(int j=1;j<=i;j++){
        sum=sum+next;
        next=sum-next;
        System.out.print(sum+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}