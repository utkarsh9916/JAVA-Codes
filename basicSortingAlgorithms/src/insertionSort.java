import java.util.*;
public class insertionSort {
    public static int [] insertion_ascending(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
    public static int [] insertion_descending(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++) {
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int arr2[]={5,4,1,3,2};
        int ans[]=insertion_ascending(arr);
        int ans2[]=insertion_descending(arr2);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
    }
}
