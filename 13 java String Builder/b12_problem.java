import java.util.*;
public class b12_problem {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder("");
    for(int i=0;i<n;i++){
      sb.append(str.charAt(sc.nextInt()));
    }
    System.out.println(sb);
    sc.close();
  }
}
