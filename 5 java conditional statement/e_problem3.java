import java.util.*;
public class e_problem3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>30){
      System.out.println("less importent");
    }
    else if(n<=30){
      System.out.println("more importent");
    }
    sc.close();
  }
}
