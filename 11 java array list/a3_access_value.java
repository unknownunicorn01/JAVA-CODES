import java.util.*;
public class a3_access_value {
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
    //printing value from any index
    // System.out.println(list.get(1));
  }
}
