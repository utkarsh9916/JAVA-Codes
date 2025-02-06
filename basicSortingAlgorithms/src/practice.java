import java.util.*;
public class practice {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={5,4,3,2,1};
        int ans []=bubble(arr);
        System.out.println(Arrays.toString(ans));

        int arr1[]={5,4,3,2,1};
        int ans1[]=selection(arr1);
        System.out.println(Arrays.toString(ans1));

        int arr2[]={5,4,3,2,1};
        int ans2[]=insertion(arr2);
        System.out.println(Arrays.toString(ans2));

        int arr3[]={5,4,3,2,1};
        int ans3[]=counting(arr3);
        System.out.println(Arrays.toString(ans3));



    }
    public static int [] bubble(int []arr){
        int n=arr.length;
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                if(swap==0){
                    break;
                }
            }
        }
        return arr;
    }
    public static int[] selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;

                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static int[] insertion(int []arr){
        for(int i=1;i<arr.length;i++){
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
    public static int [] counting(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int [max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[k]=i;
                k++;
                count[i]--;
            }
        }

           return arr;
    }
}
