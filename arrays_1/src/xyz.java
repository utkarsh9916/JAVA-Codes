public class xyz {
    public static int search(int[] nums, int target) {
        int peak=peakelement(nums);
        int first_index=ascending_binary(nums,target,0,peak);
        int second_index=ascending_binary(nums,target,peak+1,nums.length-1);
        if(first_index!=-1){
            return first_index;
        }
        else{
            return second_index;
        }
    }
    public static int peakelement(int []arr){
        int start=0;
        int end=arr.length-1;
        int ans =-1;
        if(arr.length>1){
            while(start<=end){
                int mid=(start+end)/2;
                if(mid<end &&arr[mid]<arr[mid+1]){
                    ans=mid;
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
    public static int ascending_binary(int []arr,int target,int start,int end){
         int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                ans=mid;
                return ans;
            }
            else if(arr[mid]>target){

                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int n= search(arr,0);
        System.out.println(n);

    }
}
