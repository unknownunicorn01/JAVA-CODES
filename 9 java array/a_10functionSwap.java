import java.util.Arrays;

public class a_10functionSwap {
  public static int[] swap(int[] arr, int i, int j){
    int[] nums = new int[arr.length];
    for(int k=0;k<arr.length;k++){
      nums[k] = arr[k];
    }
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    return nums;
  }
  public static void main(String[] args){
    int[] arr = new int[5];
    arr = new int[]{1,2,3,4,5};
    System.out.println("Array before swap funciton: "+Arrays.toString(arr));
    System.out.println("Array inside the function"+Arrays.toString(swap(arr , 1,4)));
    System.out.println("Array after swap fucntion: "+Arrays.toString(arr));
  }
}
