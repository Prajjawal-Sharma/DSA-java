import java.util.*;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // System.out.println("Enter rollno");
         Scanner input= new Scanner(System.in);
        // int rollno= input.nextInt();
        
        // System.out.println("Roll no is: " + rollno);

        // System.out.println("Enter a sentence: ");
        // String ph = input.nextLine();
        // System.out.println(ph);

        System.out.println("Enter first number: ");
        int num1 =input.nextInt();
        System.out.println("Enter second number: ");
        int num2= input.nextInt();
        int sum =num1+num2;
        System.out.println("Sum is: " + sum);


    }
    
}
