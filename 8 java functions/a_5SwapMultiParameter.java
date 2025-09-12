import java.util.*;
public class a_5SwapMultiParameter {
  public static void Swap(int a,int b){
    System.out.println("In swap, before swap \na: "+a+"\nb: "+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("In swap, after swap \na: "+a+"\nb: "+b);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("In main, before swap\na: "+a+"\nb: "+b);
    Swap(a,b);
    System.out.println("In main, before swap\na: "+a+"\nb: "+b); 
    sc.close();
  }
}
