public class lastOccurenece {
    public static int search(int arr[],int i,int element){
        if(i<0){
            return -1;
        }
        if(arr[i]==element){
            return i;
        }
        return search(arr,i-1,element);
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,3,2,1};
        int ans=search(arr,arr.length-1,40);
        System.out.println(ans);
    }
}
