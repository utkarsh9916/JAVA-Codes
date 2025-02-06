import java.util.*;

public class largest_number {
    public static void largest(int arr[]){
        int num=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                num=arr[i];
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        int arr[]={1,2,336,45,5};
        largest(arr);
    }
}
