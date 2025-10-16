import java.util.*;
public class b18_problem {
  public static char Solution(char ch){
    if(ch >= 'A' && ch <= 'Z'){
      return 'U';
    }
    else if(ch >= 'a' && ch <= 'z'){
      return 'L';
    }
    else{
      return 'N';
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.println(Solution(ch));
    sc.close();
  }
}
