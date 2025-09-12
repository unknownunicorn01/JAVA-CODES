import java.util.*;
public class b_if_else {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    if (age>=18){
      System.out.println("Elegible for voting");
    }
    else{
      System.out.println("Not Elegible for voting");
    }
    System.out.println("Your code has been compiled");
    sc.close();
  }
  
}
