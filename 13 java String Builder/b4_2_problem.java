import java.util.*;
public class b4_2_problem {
  public static int AJnumber(String str,int n){
    int count=0;
    int num = 0;
    for(int i=0;i<n;i++){
      num = 0;
      for(int j=i;j<n;j++){
        num = num*10 + str.charAt(j)-48;
        if(isAJ(num)){
          count++;
        }
      }
    }
    return count;
  }
  public static boolean isAJ(int n){
    int[] num = {2,3,5,7,11,13,17,19,23,29};
    if(n<2){
      return false;
    }
    for(int i=0;i<num.length;i++){
      if(n%num[i] == 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    System.out.println(AJnumber(str, n));
    sc.close();
  }
}
