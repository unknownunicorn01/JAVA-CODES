import java.util.*;
public class a_11linearSearch {
  public static int linearSearch(int[] arr ,int targ){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==targ){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of you array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter you number at index "+i+" : ");
      arr[i] = sc.nextInt();
    }
    System.out.println("Your array: "+Arrays.toString(arr));
    System.out.print("Enter the number you want to search: ");
    int num = sc.nextInt();
    System.out.println("Number "+num+" is present at index: "+linearSearch(arr, num));
    sc.close();
    System.out.println("hellow world");
    System.out.println("this is working");
  }
}
