import java.util.*;
public class occurances {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= in.nextInt();
        int count=0;

        while(num>0){
            int check=num%10;
            if(check==3){
                count++;
            } num/=10;
        }
         
        System.out.println("No. of occurences are:" + count);

    }
    
}
