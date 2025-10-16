import java.util.*;
public class b15_problem{
  public static StringBuilder Solution(int n, String str){
    String a = "ABC";  //Adrian
    String b = "BABC";  //Bruno
    String c = "CCAABB"; //Goran
    int a1 = 0;
    int b1 = 0;
    int c1 = 0;
    int count_a=0;
    int count_b=0;
    int count_c=0;
    
    StringBuilder sb = new StringBuilder("");
    
    for(int i=0;i<n;i++){
      if(count_a > 2){
        count_a = 0;
      }
      if(count_b > 3){
        count_b = 0;
      }
      if(count_c > 5){
        count_c = 0;
      }
      if(str.charAt(i) == a.charAt(count_a)){
        a1++;
      }
      if(str.charAt(i) == b.charAt(count_b)){
        b1++;
      }
      if(str.charAt(i) == c.charAt(count_c)){
        c1++;
      }

      count_a++;
      count_b++;
      count_c++;
    }

    if(a1>=b1 && a1>=c1){
      sb.append(a1);
    }
    else if(b1>=a1 && b1>=c1){
      sb.append(b1);
    }
    else if(c1>=b1 && c1>=a1){
      sb.append(c1);
    }

    if(a1>=b1 && a1>=c1){
      sb.append("\nAdrian");
    }
    if( b1>=a1 &&  b1>=c1){
      if(sb.length() != 0){
        sb.append("\n");
      }
      sb.append("Bruno");
    }
    if(c1>=b1 && c1>=a1){
      if(sb.length() != 0){
        sb.append("\n");
      }
      sb.append("Goran");
    }
    return sb;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    System.out.println(Solution(n,str));
    sc.close();
  }
}