import java.util.*;

//moving zeros to front
public class movingZeros {
    public static int [] zeros(int []arr){
      for(int i=0;i<arr.length;i++){
          int min=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[min]>arr[j]){
                  min=j;

              }
          }
          if(arr[min]==0){
              int temp=arr[min];
              arr[min]=arr[i];
              arr[i]=temp;
          }
          else{
              break;
          }
      }
      return arr;
    }

    public static void main(String[] args) {
        int arr[]={0,5,0,3,4,2};
        int ans []=zeros(arr);
        System.out.println(Arrays.toString(ans));

//        zeros to end
        int arr1[]={0,5,0,3,4,2};
        int ans1 []=zerostoend(arr);
        System.out.println(Arrays.toString(ans1));
    }

//    moving zero to end

    public static int [] zerostoend(int []arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[min] < arr[j]) {
                    min = j;

                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
        return arr;
    }

//    using bubble sort
public void moveZeroes(int[] nums) {
    for(int i=0;i<nums.length-1;i++){
        for(int j=0;j<nums.length-1-i;j++){
            if(nums[j]==0){   // only here condition changes
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
    }
}
}
