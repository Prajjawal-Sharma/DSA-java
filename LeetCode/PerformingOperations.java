class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.charAt(0)=='+' || s.charAt(s.length()-1)=='+'){
                x+=1;
            } else{
                x-=1;
            } 
        } return x;
    }
}