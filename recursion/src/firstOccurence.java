public class firstOccurence {
     public static int search(int []arr,int i,int element){
         if(i==arr.length){
             return -1;
         }
         if(arr[i]==element){

             return i;
         }
         return search(arr,i+1,element);
     }

    public static void main(String[] args) {
        int arr[]={5,10,1,1,23,4};
        int ans=search(arr,0,100);
        System.out.println(ans);
    }
}
