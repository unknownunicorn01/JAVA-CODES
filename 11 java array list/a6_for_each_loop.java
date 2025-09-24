import java.util.ArrayList;

public class a6_for_each_loop {
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    for(int val : list){
      System.out.println(val);  // it will print all the value in array list
    }
  }
}
