import java.util.*;
public class linear_search {
    public static int linear_search(int arr[],int key){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int index=linear_search(arr,40);
        if(index==-1){
            System.out.println("not found");
        }
        else {
            System.out.println(index);
        }
    }
}
