import java.util.Arrays;

public class a_9functionSwap {
  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args){
    int[] arr = new int[5];
    arr = new int[]{1,2,3,4,5};
    System.out.println("Array before swap funciton: "+Arrays.toString(arr));
    swap(arr , 1,4);
    System.out.println("Array after swap fucntion: "+Arrays.toString(arr)); //this will print swap function swaping because this will sent the memory address to the function and will make changed in this array.

    //solution in next file
  }
}
