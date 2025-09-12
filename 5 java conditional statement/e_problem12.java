import java.util.*;
public class e_problem12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a*a+b*b)==c*c){
      System.out.println("2");
    }
    else if((a*a+b*b+c*c)>2*c*c){
      System.out.println("1");
    }
    else if((a*a+b*b+c*c)<2*c*c){
      System.out.println("3");
    }
    sc.close();
  }
}
