public class leetcode_852_mountain_peak {
//    first brutforce approach
    public static int brut(int []arr){
        if(arr.length>=1){
            int ans=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[i+1]){
                    ans=i;
                    break;

                }

            }
            return ans;

        }
        return -1;
    }


//    binary search approach
    public static int binary(int[]arr){
        if(arr.length>=1){
            int ans=0;
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                    if(arr[mid]>arr[mid+1]){
                        ans=mid;
                        end=mid-1;  // check again if there is some other element before it
                    }
                    else{
                        start=mid+1;
                    }
            }
            return ans;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        int arr1[]={1,2,3,4,4,3,2,1};
        System.out.println(brut(arr));
        System.out.println(binary(arr));
        System.out.println(brut(arr1));
        System.out.println(binary(arr1));
    }
}
