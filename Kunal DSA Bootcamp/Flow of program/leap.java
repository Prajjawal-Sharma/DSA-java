import java.util.*;


public class leap {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year:");
        int n=input.nextInt();
        input.close();
        if(n%4==0){
            System.out.println("It is a leap year");
        } else{
            System.out.println("It is not a leap year");
        }
    }
}
