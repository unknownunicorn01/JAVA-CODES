import java.util.Arrays;

public class a_4arrayupdate {
  public static void main(String[] args){
    int arr[] = {1,2,3,4,5};
    System.out.println(Arrays.toString(arr));  //old array
    arr[4] = 10;  //updation
    System.out.println(Arrays.toString(arr));  //new array
  }
}
