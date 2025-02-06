import java.util.*;
public class countingSort {
    public static int [] sort(int []arr){
        int max=Integer.MIN_VALUE;
//        finding maximun element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
//        creating new element
        int freq[]=new int[max+1];
        // beacuse if there is max element 8 then we have to make element upto index 8 so if we increase length by 1 thern it comes upto index 8
//       making frequency array
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

//        sorting an array
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={5,1231,4,2,3,4,3,234};
        int ans[]=sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
