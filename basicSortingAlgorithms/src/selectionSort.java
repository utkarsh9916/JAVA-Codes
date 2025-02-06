import java.util.*;
public class selectionSort {

//    for ascending
    public static int [] selection(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

//    for descending
    public static int []selectionSort(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int []arr={7,5,4,1,3};
        int ans[]=selection(arr);
        System.out.println(Arrays.toString(ans));
        int ans2[] = selectionSort(arr);
        System.out.println(Arrays.toString(ans2));
    }
}
