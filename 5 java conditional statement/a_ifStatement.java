import java.util.*;
public class a_ifStatement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    if(age>=18){
      System.out.println("Elegible for voteing");
    }
    System.out.println("code has been compiled");
    sc.close();
  }
}