import java.util.*;
public class e_problem1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    if(num%6==0){
      System.out.println("Divisible");
    }
    else{
      System.out.println("Not divisible");
    }
    sc.close();
  }
}