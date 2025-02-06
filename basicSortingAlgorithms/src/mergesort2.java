public class mergesort2 {
    public class merge2 {
        public static void main(String[] args) {
            int arr[]={5,6,8,9,2};
            mergesort(arr,0,arr.length-1);
            for(int i:arr){
                System.out.print(i+";");
            }
        }
        public static void mergesort(int []arr,int s,int e){
            if(s>=e) return ;
            int mid=(s+e)/2;
            mergesort(arr,0,mid);
            mergesort(arr,mid+1,e);
            merge(arr,s,mid,e);

        }
        public static void merge(int arr[],int s,int mid,int e){
            int [] temp=new int [e-s+1];
            int left=s;
            int right=mid+1;
            int idx=0;
            while(left<=mid && right<=e){
                if(arr[left]>arr[right]){
                    temp[idx]=arr[right];
                    idx++;
                    right++;
                }
                else{
                    temp[idx]=arr[left];
                    idx++;
                    left++;

                }
            }
            while(left<=mid){
                temp[idx]=arr[left];
                idx++;
                left++;

            }
            while(right<=e){
                temp[idx]=arr[right];
                idx++;
                right++;
            }
            for(int i=0;i<temp.length;i++){
                arr[s+i]=temp[i];
            }

        }
    }




}
