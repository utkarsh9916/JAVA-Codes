import java.util.*;
public class bubbleSort {

    public static int[] bubble(int []arr){
        int n=arr.length;
        for(int turns=0;turns<n-1;turns++){
            for(int j=0;j<n-turns-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
        }
        return arr;
    }
public static int []  bobbleSort(int[]arr){
        int n=arr.length;
        for(int turn =1;turn<=n-1;turn++){
            for(int i=0;i<=n-turn-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    return arr;
}

public static int []  optimizedBubble(int []arr){
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++){
            int swap=0;
            for(int j=0;j<n-1-turn;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
            }
            if(swap==0){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={5,4,2,1,3};
        int ans1[]=bubble(arr);
        System.out.println(Arrays.toString(ans1));
    }
}
