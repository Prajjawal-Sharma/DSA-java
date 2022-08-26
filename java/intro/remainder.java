import java.util.*;
public class remainder {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int num= in.nextInt();
        int reverse=0;

        while(num>0){
            reverse*=reverse*10 + num%10;
            num/=10;
        }
        System.out.println("Reverse of number is: " + reverse); 
    }
    
}
