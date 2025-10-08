import java.util.*;
public class b7_problem {
  public static StringBuilder Solution(StringBuilder sb){
    int n = sb.length();
    StringBuilder str = new StringBuilder("");
    for(int i=0;i<n;i++){
      if(sb.charAt(i) >= 'A' && sb.charAt(i) <='Z'){
        str.append('_');
      }
      str.append(sb.charAt(i));
    }
    return str;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    sc.nextLine();
    while(testCase > 0){
      StringBuilder sb = new StringBuilder(sc.nextLine());
      System.out.println(Solution(sb));
      testCase--;
    }
    sc.close();
  }
}
