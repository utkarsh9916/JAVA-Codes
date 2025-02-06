import java.util.*;
public class array_assingment {

//    question1
    public static boolean  checker(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

//    question 2
    public static int target(int[]arr,int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return 1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

       return 0;
    }

//    question 5;
    public static void triplets(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5};
        System.out.println(checker(arr));

        System.out.println(target(arr,3));
        int arr2[]={-1,0,1,2,-1,-4};
        triplets(arr2);

    }
}
