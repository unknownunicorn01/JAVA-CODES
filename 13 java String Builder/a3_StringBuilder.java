public class a3_StringBuilder {
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder("Shikhar");

    // to index in a index and increase the index of other value in front of that index
    sb.insert(0,'H');
    System.out.println(sb);

    // delete function is use to delete a value from index
    sb.delete(0,1); // this will delete the value from index 0 to before end index given 1 mean only index 0 value will be deleted

    System.out.println(sb);
    // or we can write sb.deleteCharAt(index);
    sb.deleteCharAt(0); // it will delete the value at index 0 which is S
    System.out.println(sb);    
  }
}
