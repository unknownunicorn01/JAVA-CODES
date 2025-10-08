import java.util.*;
public class b6_problem {
  public static StringBuilder solution(int n,StringBuilder sb){
    StringBuilder str = new StringBuilder("");
    for(int i=0;i<n;i++){
      if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
        str = str.append((char)(sb.charAt(i) - 32));
      }
      else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
        str = str.append((char)(sb.charAt(i) + 32));
      }
      else{
        str.append(sb.charAt(i));
      }
    }
    return str;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    StringBuilder sb = new StringBuilder(sc.nextLine());
    System.out.println(solution(n,sb));
    sc.close();
  }
}