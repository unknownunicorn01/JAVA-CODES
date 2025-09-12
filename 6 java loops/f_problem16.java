import java.util.*;
public class f_problem16 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n2=n;
    int num=0;
    while(n!=0){
      num=num*10+(n%10);
      n=n/10;
    }
    sc.close();
    if(num==n2){
      System.out.println(true);
    }
    else{
      System.out.println(false);
    }
  }
}
