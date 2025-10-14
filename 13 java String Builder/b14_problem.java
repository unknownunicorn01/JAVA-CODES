import java.util.*;
public class b14_problem {
  public static StringBuilder Solution(String str){
    StringBuilder sb = new StringBuilder("");
    for(int i=0;i<str.length();i++){
      if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
        sb.append(str.charAt(i));
      }
    }
    return sb;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(Solution(str));
    sc.close();
  }
}
