import java.util.*;
public class casecheck {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string: ");
        char ch= in.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Character is lower case");

        } else{
            System.out.println("Character is upper case");
        }
    }
    
}
