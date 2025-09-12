import java.util.Arrays;

public class a_5traverceArray {
  public static void main(String[] args){
    int arr[] = new int[5]; // array of size 5 created
    for(int i=0;i<arr.length;i++){
      arr[i] = i+1;
    }
    System.out.println(Arrays.toString(arr));

    System.out.println("Now triverce, using for each loop");
    for(int val : arr){
      System.out.println(val);
    }
  }
}
