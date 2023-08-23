public class Solution {
	public static boolean isPrime(int num) {
		//Your code goes here
		int i=num;
		int count=0;
		while(i>0){
			if(num%i==0){
				count++;
				
			}i--;
		} if(count==2){
			return true;
		} else{
			return false;
		}
	}
	
}