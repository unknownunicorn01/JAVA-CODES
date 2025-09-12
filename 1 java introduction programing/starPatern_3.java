/*
 we have to print the pattern given bellow:

 ******
  *
   *
    *
     *
 ******

 (given pattern is in 6x6 patern shape in Z vertically inverted)
 */





// import java.util.Scanner;
// public class starPatern_3 {
//   public static void main(String[] args)
//   {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number of line you want: ");
//     int n = sc.nextInt();
//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=n-1;j++)
//       {
//         if(i==1 || i==n){
//           System.out.print("*");
//         }
//         else if(i>n || j<i){
//           System.out.print(" ");
//         }
//       }
//       System.out.println("*");
//     }
//   }
// }

//this is a good creal and a bit fast but, lets make it more clear

import java.util.Scanner;
public class starPatern_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many line you want your patern: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
            }
            for(int j=2;j<=i-1;j++){
                if(j==i){
                    System.out.print("*");
                }
            }
        }
    }
}
