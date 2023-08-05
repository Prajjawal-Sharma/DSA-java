import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index of fibonacci series: ");
        int n= input.nextInt();
        int a=0;
        int b=1;
        int sum=0;

        for(int i=1;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }

        System.out.println(b);
    }

    
}
