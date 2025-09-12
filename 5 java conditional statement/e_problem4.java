import java.util.*;
public class e_problem4 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num>1){
      System.out.println("You entered more");
    }
    else if(num<=1){
      System.out.println("Your entered less");
    }
    sc.close();
  }
}
