public class BinarySearch_ceilingQuestion {

//    ceiling number question
    public static int ceiling(int arr[],int target){
//        last ke element se bhi bada target hai to uska koi answer nhi hoga
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }

//    greatest element just smallest than or equal the target
    public static int floor(int []arr,int target){
//        first ke element se bhi chota target hai to uska answer nhi hoga
        if(target<arr[0]){
            return -1;
        }
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=139;
        int target_2=17;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target_2));
    }
}
