import java.util.*;
public class a5_remove_value {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<n;i++){
      list.add(sc.nextInt());
    }
    System.out.println("your array list:\n"+list);
    System.out.print("Enter the index of the number you want to remove: ");
    int rem = sc.nextInt();
    list.remove(rem);
    System.out.println("Your updated list: "+list);
    sc.close();
  }
}
