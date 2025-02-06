public class MaxSubarray_1 {
    public static void maxsubarray(int []arr){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr=0;
                for(int k=i;k<=j;k++){
                    curr+=arr[k];
                }
                if(curr>max){
                    max=curr;
                }
            }
        }
        System.out.println("Maximun sum is "+max);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxsubarray(arr);
    }
}
