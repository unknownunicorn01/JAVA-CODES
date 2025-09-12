import java.util.Arrays;

public class a_8functionArrDeepcopy {
  public static int[] func(){
    int[] nums = new int[5];
    nums = new int[]{1,2,3,4,5};  //her we gave this array another address
    return nums;
  }
  public static void main(String[] args){
    int[] arr = new int[5];
    arr = func();
    System.out.println("arr after function call: "+Arrays.toString(arr)); //this will store the address of the array in function 
  }
}
