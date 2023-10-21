import java.util.*;

public class multiplication {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of which multiplicaton table should be printed:");
        int temp=0;
        int n=in.nextInt();
        in.close();
        for(int i=0;i<=10;i++){
            
            System.out.println(n + "X" + i + "=" + temp);
            temp+=n;
        }
    }
}

    

