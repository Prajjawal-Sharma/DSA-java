class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices.length==1){
            return 0;
        }
        int maxVal=0;
        int minVal=Integer.MAX_VALUE;
     for(int i=0;i<prices.length;i++){
        minVal=Math.min(minVal,prices[i]);
        maxVal=Math.max(maxVal,prices[i]-minVal);
     }
     return maxVal;
}
}