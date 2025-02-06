public class leetcode_1095_findInMountainArray {
    public static int findInMountainArray(int target, int []mountainArr) {
        int []arr = new int [mountainArr.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=mountainArr[i];
        }
        int peak=peakelement(arr);
        int first_index=binary(arr,target,0,peak);
        int second_index=binary(arr,target,peak+1,mountainArr.length-1);
        if(first_index!=-1){
            return first_index;
        }
        else{
            return second_index;
        }
    }
    public static int binary(int []mountainArr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(mountainArr[mid]==target){
                return mid;
            }
            else if(mountainArr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binary1(int []mountainArr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(mountainArr[mid]==target){
                return mid;
            }
            else if(mountainArr[mid]>target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static  int peakelement(int [] mountainArr){
        int start=0;
        int end=mountainArr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<end && mountainArr[mid]>mountainArr[mid+1]){
                ans=mid;
                end=mid-1;
            }

            else{
                start=mid+1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        int n=findInMountainArray(3,arr);
        System.out.println(n);
        int n1=peakelement(arr);
        System.out.println(n1);
        int arr2[]={4,5,6,7,0,1,2};
        int n3=peakelement(arr2);
        int n4=findInMountainArray(0,arr2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
