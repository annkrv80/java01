/*import java.util.Scanner;
class Program {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("name: ");
       String name = iScanner.nextLine();
       System.out.printf("Привет, %s!", name);
       iScanner.close();
   }
}*/

/*import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
}}*/
import java.util.Scanner;
class Program {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("int a: ");
       boolean flag = iScanner.hasNextInt();
       System.out.println(flag);       
       int i = iScanner.nextInt();
       System.out.println(i);       
       iScanner.close();
   } }

