import java.util.*;
public class mergerSort {
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei) return ;
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0;k<temp.length;k++){
            arr[si+k]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    
}
