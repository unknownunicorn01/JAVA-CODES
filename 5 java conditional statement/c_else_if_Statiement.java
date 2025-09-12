import java.util.*;
public class c_else_if_Statiement {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter you age: ");
    int age = sc.nextInt();
    if(age>=18){
      System.out.println("Elegible for voting");
    }
    else if(age>=0 && age <18){
      System.out.println("Not elegible for voting");
    }
    else{
      System.out.println("Invalid age");
    }
    System.out.println("Your code has been compiled");
    sc.close();
  }
}
