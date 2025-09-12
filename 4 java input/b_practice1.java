import java.util.Scanner;
public class b_practice1 {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the value of a : ");
    int a = scn.nextInt();
    System.out.println("enter the value of b : ");
    int b = scn.nextInt();
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a%b);
    System.out.println((int)(a/b));
    scn.close();
  }  
}
