import java.util.Scanner;
public class g_multiplicationTable {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number, You want table of: ");
    int a = sc.nextInt();
    for(int i=1; i<11;i++){
      System.out.println(a +" X "+ i +" = " + i*a );
    }
    sc.close();
  }
}
