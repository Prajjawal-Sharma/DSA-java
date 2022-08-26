import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

    int ans=0;

    
        System.out.println("Enter the operator (+,-,*,/,%): ");
        char op= in.next().trim().charAt(0);
        
            System.out.println("Input 2 numbers:");
            int num1=in.nextInt();
            int num2= in.nextInt();

            switch(op){
            case '+':
                ans=num1+num2;
                    break;
            
            case '-':
                ans=num1-num2;
                break;
            
            case '*':
                ans=num1*num2;
                break;
            case '/':
                if(num2!=0){
                    ans=num1/num2;

                }break;
               
            
            case '%':
                ans=num1%num2;
                break;

            default:
            System.out.println("Invalid operator!");
        }
        System.out.println("Result:" + ans);
    }
}
   
    

