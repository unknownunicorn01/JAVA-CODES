import java.util.*;
class Solution{
  public void Solutions(StringBuilder sb){
    for(int i=0;i<sb.length();i++){
      if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' && i!=0){
        System.out.println();
      }
      System.out.print(sb.charAt(i));
    }
  }
}
public class b11_2problem {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    Solution obj = new Solution();
    obj.Solutions(sb);
    sc.close();
  }
}
