import java.util.*;
public class b9_problem {
  public static StringBuilder getString(StringBuilder sb){
    StringBuilder str = new StringBuilder("");
    int count=1;
    for(int i=0;i<sb.length()-1;i++){
      if(sb.charAt(i) == sb.charAt(i+1)){
        count++;
      }
      else{
        if(count == 1){
          str.append(sb.charAt(i));
          count = 1;
        }
        else{
          str.append(sb.charAt(i));
          str.append(count);
          count = 1;
        }
      }
    }
    str.append(sb.charAt(sb.length()-1));
    if(sb.charAt(sb.length()-1) == sb.charAt(sb.length()-2)){
      str.append(count);
    }
    return str;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    sc.nextLine();
    while(testCase > 0){
      StringBuilder sb = new StringBuilder(sc.nextLine());
      System.out.println(getString(sb));
      testCase--;
    }
    sc.close();
  }
}
