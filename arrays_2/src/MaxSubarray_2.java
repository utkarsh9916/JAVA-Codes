public class MaxSubarray_2 {
//    max sum of subarray using prefix sum
        public static void subarray(int []arr){
//            first create a subarray
                int prf_arr[]=new int [arr.length];
                prf_arr[0]=arr[0];
                for(int i=1;i<arr.length;i++){
                        prf_arr[i]=prf_arr[i-1]+arr[i];
                }

//                variables for sums
                int max=0;
                for(int i=0;i<arr.length;i++){
                        int start=i;
                       int curr=0;
                        for(int j=i;j<arr.length;j++){
                                int end=j;
                                curr=start==0?prf_arr[end]:prf_arr[end]-prf_arr[start-1];
                                if(curr>max){
                                        max=curr;
                                }
                        }

                }
                System.out.println("maximum sum is "+max);
        }

        public static void main(String[] args) {
                int arr[]={2,4,6,8,10};
                subarray(arr);
        }
}
