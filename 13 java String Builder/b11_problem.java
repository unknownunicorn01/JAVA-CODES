import java.util.*;
public class b11_problem {
  public static void Solution(StringBuilder sb){
    for(int i=0;i<sb.length();i++){
      if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' && i!=0){
        System.out.println();
      }
      System.out.print(sb.charAt(i));
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    Solution(sb);
    sc.close();
  }
}
