import java.util.*;
public class MaxSubarray_Kadane {
    public static int kadane(int[]arr){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
//    this is the condition when there is all the elemets are negative in array.
    public static int advance_kadane(int[]arr){
        int curr=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
              return  kadane(arr);

            }
            else{
                if(curr<arr[i]){
                    curr=arr[i];
                }
            }
        }
        return curr;

    }
    public static void main(String[] args) {
        int []arr1= {-2,-3,4,-1,-2,1,5,-3};
        int []arr2={-2,-4};
        System.out.println(kadane(arr1));;
        System.out.println(advance_kadane(arr1));
        System.out.println(advance_kadane(arr2));
    }
}
