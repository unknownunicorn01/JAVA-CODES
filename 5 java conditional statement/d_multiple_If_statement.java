import java.util.*;
public class d_multiple_If_statement {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number between 1 to 5: ");
    int num = sc.nextInt();
    if(num>5 || num<1){
      System.out.println("Invalid number ");
    }
    if(num<=5 && num >=1){
      System.out.println("number is : "+num);
    }
    else{
      System.out.println("number is not in range");
    }
    System.out.println("Your code had been compiled");
    sc.close();
  }
}
