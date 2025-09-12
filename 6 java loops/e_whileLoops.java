import java.util.*;
public class e_whileLoops {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("this code will run until you type the number greater then 100");
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    while(n<=100){  //while loop is used when you want run the look while a certain condition is not true
      System.out.print("Enter the value of n: ");
      n=sc.nextInt();
    }
    System.out.println("Code has been exicuted!!!");
    sc.close();
  }
}
