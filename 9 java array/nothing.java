
import java.util.*;

public class nothing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter you princilal value : ");
        Float P  = sc.nextFloat();
        // System.out.println("Enter the time given : ");
        int T  = sc.nextInt();
        // System.out.println("Enter the rate of you interest : ");
        Float R  = sc.nextFloat();

    System.out.println("Simple interest = " + Math.round((P*T*R)/100 * 100.0) / 100.0);
    sc.close();
    }
}

