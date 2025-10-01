import java.util.*;
public class b1_problem {
  public static String Solution(StringBuilder sb){
    String str = "";
    for(int i=0;i<sb.length()-1;i++){
      str += sb.charAt(i);
      str += ((int)(sb.charAt(i+1)-sb.charAt(i)));
    }
    str += sb.charAt(sb.length()-1);
    return str;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    System.out.println(Solution(sb));
    
    sc.close();
  }
}
