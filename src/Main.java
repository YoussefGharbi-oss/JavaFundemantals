import java.awt.*;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //primitive Data Types
        //byte Range (-2pow(7) )
        byte age = 23 ;
        long viewCount = 125000 ;
        float price = 234.25F ;
        char gender = 'M' ;
        boolean isValid = true ;
        //No primitive Types
        String name = "Youssef" ;
        Date now = new Date() ;
        System.out.println(now);
        Point  point1 = new Point(10, 10) ;
        System.out.println(point1.x +  point1.y);
        //Reading From user
        Scanner scanner = new Scanner(System.in)  ;
        System.out.println("Enter Your name ");
        String full_name = scanner.nextLine() ;
        int  value = scanner.nextInt() ;
        char sexe = scanner.next().charAt(0) ;
        System.out.println("Name : " + full_name) ;
        System.out.println("age : " + value) ;
        System.out.println("sexe : " + sexe) ;
        //Type casting
        int a = 5 ;
        // implicit TYpe casting  from int to Double int --> Double
        float b = a ;
        System.out.println(b);

        //explicit type Casting
        //Double can t turn into integer Value Double --> int By default method
        //So casting he removes the float part
        double DoubleValue = 15.02 ;

        int intValue = (int)DoubleValue ;
        System.out.println(intValue);




    }
}