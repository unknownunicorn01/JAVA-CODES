import java.util.*;
public class g_DoWhileLoop {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Because we are using do while look it will check the condition after runing one time,/nHence write a number which is greater then 100 ");
    int n = sc.nextInt();
    do{
      System.out.println("This code is inside do while loop");
      System.out.println("Your number is: "+n);
      if(n<=100){
        System.out.println("Enter your number: ");
        n = sc.nextInt();
      }
    }while(n<=100);
    System.out.println("code has been exicuted");
    sc.close();
  }
}
