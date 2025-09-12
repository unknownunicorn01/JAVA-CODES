import java.util.Scanner;
// public class a2_number1to99 {
//   public static void main(String[] args){
//     for(int i=1;i<100;i++){
//       System.out.println(i);
//     }
//   }
// }

/* crate a multiplication table take input from teh user */

public class a2_number1to99 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to table of: ");
    int num= sc.nextInt();
    for(int i=1; i<11;i++){
      System.out.println(num+" X "+i+" = "+(i*num));
    }
  }
}