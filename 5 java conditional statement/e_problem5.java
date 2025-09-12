import java.util.*;
public class e_problem5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    if(a%2==1 && b%2==1){
    System.out.println("we are odd");
    }
    else{
    System.out.println("we are simple");
    }
    sc.close();
  }
}
