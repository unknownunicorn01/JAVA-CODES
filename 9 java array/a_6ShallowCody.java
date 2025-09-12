import java.util.Arrays;

public class a_6ShallowCody {
  public static void main(String[] args){
    int arr[] = {1,2,3,4,5};
    System.out.println("arr: "+Arrays.toString(arr));
    int newArr[] = arr; //this is storing the address of the array
    newArr[1]=10;
    newArr[2]=20;
    System.out.println("newArr: "+Arrays.toString(newArr));
    System.out.println("arr: "+Arrays.toString(arr));  //when you will change the value in new array it will change in you original array too because new array is contaiging the address of original array
  }
}
