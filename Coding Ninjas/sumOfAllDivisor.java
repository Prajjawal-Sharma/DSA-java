import java.util.*;
public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
        
        }return sum;
    }

