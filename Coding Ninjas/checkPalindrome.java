public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int org=n;
        int val=0;
        while(n>0){
            val=val*10 +n%10;
            n=n/10;
        }
        if(val==org){
            return true;
        } return false;
    }
}