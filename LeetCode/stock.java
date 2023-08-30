class Solution {
    public int maxProfit(int[] arr) {
        int min,max,sum=0;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            int temp=0;
            for(int j=i+1;j<arr.length;j++){
                max=arr[j];
                if(max>min){
                    temp=max-min;
                    if(temp>sum){
                        sum=temp;
                    } else{
                        continue;
                    }
                } else{
                    continue;
                }
            }
        } return sum;
        } 
       
    }
