import java.util.*;
public class Leetcode_34_BinarySearch {
    public static int search(int []arr,int target,boolean findFirstindex){
        int ans =-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                if(findFirstindex==true){   // why i use this because it here is some target before the mid so that is can find
                    end=mid-1;          // why i use this because it here is some target after the mid so that it can find it
                }
                else{
                    start=mid+1;
                }
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
    public static int [] index(int []arr,int target){
        int nums[]={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        nums[0]=start;
        nums[1]=end;
        return nums;
    }

    public static void main(String[] args) {
        int arr[]={1,7,7,7,8,9};
        int target=7;
        int arr1[]=index(arr,target);
        System.out.println(Arrays.toString(arr1));
        System.out.println(search(arr,7,true));
    }
}
