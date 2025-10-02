public class a3_selection_sort {
   public static void main(String[] args){
    int[] arr = {4,8,7,1,-2};
    int n = arr.length;
    for(int i=0;i<n-1;i++){
      int maxIdx = i;
      for(int j=i+1;j<n;j++){
        if(arr[maxIdx] > arr[j]){
          maxIdx = j;
        }
      }
      int temp = arr[maxIdx];
      arr[maxIdx] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}

