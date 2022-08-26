import java.util.*;
class Helloh{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr={3,1,2,4};
        System.out.println(Arrays.toString(cyclic(arr))); 
    }
    static int[] cyclic(int[] arr){
        for(int i=0;i<arr.length;i++){ //complexity is bigO of n 
            if(i!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
        }
        return arr;
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}