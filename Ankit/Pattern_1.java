import java.util.Scanner;

public class Pattern_1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Row num");
          int row = sc.nextInt();

          for (int i = 1; i <= row; i++) {
               for (int j = 1; j <= i; j++) {

                    System.out.print("* ");

                    // System.out.print(j);
               }
               System.out.println("");
          }
          sc.close();
     }

}
