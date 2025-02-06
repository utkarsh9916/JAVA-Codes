public class BinarySearch_GeeksforGeeks {
//    Q  find the position of elements from the sorted array of infinite elements
    public static int binarySearch(int []arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int ans(int []arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;  // hence this start is for new array
            end=end+(end-start+1)*2;// here we require old start value to find the size of old array so that we can double the size of new array and to fine its end index
              start=temp;   // provide the start its new value;
        }
        return binarySearch(arr,target,start,end);

    }

    public static void main(String[] args) {
        int arr[]={3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(ans(arr,170));
    }
}


//this code is causing oroblem because it is for infinite loop
