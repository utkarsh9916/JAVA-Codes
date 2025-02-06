import java.util.*;
public class binary_search {
    public static  int binary(int []arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return 1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=34;
        System.out.println(binary(arr,key));
    }
}
