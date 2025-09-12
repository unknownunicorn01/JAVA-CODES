import java.util.*;
public class b_problem10_1 {
  public static void func(int[] arr, int[] arr2){
    long num1=0;
    long num2=0;
    for(int i=0;i<arr.length;i++){
      num1 = num1*10 + arr[i];
    }
    for(int i=0;i<arr2.length;i++){
      num2 = num2*10 + arr2[i];
    }
    System.out.println("bellow is the answer");
    System.out.println("num1: "+num1);
    System.out.println("num2: "+num2);
    long num3 = num1 + num2;
    System.out.println("num3: "+num3);
    for(int i=0;i<String.valueOf(num3).length();i++){
      System.out.println(String.valueOf(num3).charAt(i));
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Your first array: "+Arrays.toString(arr));
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    System.out.println("Your first array: "+Arrays.toString(arr2));
    func(arr, arr2);
    sc.close();
  }
  
}
