import java.util.Arrays;

public class a_2DeepCopy {
  public static void main(String[] args){
    int[] arr = new int[5];
    arr = new int[]{1,2,3,4,5};
    int[] newArr = new int[arr.length];
    for(int i=0;i<arr.length;i++){
      newArr[i]=arr[i];  //here we are createing copy by deepcopy which mean it will store it in deffrent memory address
    }
    newArr[1]=11;
    newArr[4]=100;
    System.out.println("arr: "+Arrays.toString(arr));
    System.out.println("newArr: "+Arrays.toString(newArr));
  }
}
