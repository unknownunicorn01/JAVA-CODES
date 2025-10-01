import java.util.*;
public class b2_problem {
  public static StringBuilder Solution(int n){
    StringBuilder sb = new StringBuilder("");
    char ch = 'a';
    for(int i=0;i<n;i++){
      if(ch>'z'){
        ch = 'a';
      }
      if(i%2==0){
        sb.insert(0,ch);
      }
      else{
        sb.append(ch);  
      }
      ch++;
    }
    return sb;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while(test>0){
      int n = sc.nextInt();
      System.out.print(Solution(n));
      System.out.println();
      test--;
    }
    sc.close();
  }
}
