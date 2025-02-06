public class Leetcode_findmountainpeakhard {


//    this is brutforce approach not working everywhere
    public static int findInMountainArray(int target, int [] mountainArr) {
        int start=0;
        int ans=0;
        int ans2=-1;
        int end=mountainArr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mountainArr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(mountainArr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(ans>=0){
            return ans;
        }
        else{
            return ans2;
        }
    }

    public static void main(String[] args) {
        int []arr={1,5,2};
        int n = findInMountainArray(2,arr);
        System.out.println(n);

    }
}
