import java.util.*;
public class b10_problem {
  public static boolean Solution(StringBuilder sb,String str){
    boolean isThere = true;
    int strLen = sb.length();
    for(int i=0;i<strLen; i++){
      if(str.contains(sb.substring(i,i+1)) == false){
        isThere = false;
        break;
      }
    }
    return isThere;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    int n = sc.nextInt();
    int count = 0;
    sc.nextLine();
    while (testCase >0){
      count = 0;
      for(int i=0;i<n;i++){
        StringBuilder sb = new StringBuilder(sc.nextLine());
        if(Solution(sb,str)){
          count++;
        }
      }
      System.out.println(count);
      testCase--;
    }
    sc.close();
  }
}
