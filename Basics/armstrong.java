import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();

        System.out.println(isArmstrong(num));


    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum= sum+ rem*rem*rem;
            n=n/10;
        }
        return sum==original;
    }
}
