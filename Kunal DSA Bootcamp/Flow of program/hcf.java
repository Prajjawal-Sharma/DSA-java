import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter 1st number:");
        int n=in.nextInt();
        System.out.println("Enter 2nd number:");
        int m=in.nextInt();
        in.close();
        for(int i=1;i<m || i<n;i++){
            if(m%i==0 && n%i==0){
                temp=i;
            }
        } 
        System.out.println("HCF of both number is:" + temp);
        System.out.println("LCM of both number is:" + ((n*m)/temp));


    }
}
