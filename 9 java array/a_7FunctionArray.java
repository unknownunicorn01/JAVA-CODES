import java.util.Arrays;

public class a_7FunctionArray {
  public static int[] func(){
    int[] nums = {1,2,3,4,5};
    return nums;
  }
  public static void main(String[] args){
    int[] arr = new int[5];
    System.out.println("arr:"+ Arrays.toString(arr));
    arr = func();  //this will store the address value of the array in the function 
    System.out.println("arr after fucntion : "+Arrays.toString(arr));// so the value in arr will be same as the value in nums
  }
}
