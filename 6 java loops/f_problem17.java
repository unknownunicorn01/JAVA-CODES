import java.util.*;
public class f_problem17{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c=Math.min(a,b);
    for(int i=c;i>=2;i--){
      if(a%i==0 && b%i==0){
        System.out.println(i);
        break;
      }
    }
    sc.close();
  }
}