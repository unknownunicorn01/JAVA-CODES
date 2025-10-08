import java.util.*;
public class b7_2problem {
  public static StringBuilder Solution(StringBuilder sb){
    int n = sb.length();
    boolean isUnderScore = false;
    StringBuilder str = new StringBuilder("");
    for(int i=0;i<n;i++){
      if(sb.charAt(i) == '_'){
        isUnderScore = true;
        continue;
      }
      if(isUnderScore){
        str.append((char)(sb.charAt(i) - 32));
        isUnderScore = false;
      }
      else{
        str.append(sb.charAt(i));
      }
    }
    return str;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t>0){
      StringBuilder sb = new StringBuilder(sc.nextLine());
      System.out.println(Solution(sb));
      t--;
    }
    sc.close();
  }
}
