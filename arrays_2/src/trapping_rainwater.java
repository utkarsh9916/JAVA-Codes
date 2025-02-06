import java.util.*;
public class trapping_rainwater {
//    find the amount of water trapped by the walls whose heights are given in an array
    public static int rainwater(int []arr){
        int [] left_max=new int [arr.length];
        int []right_max=new int [arr.length];
        int volume=0;
         left_max[0]=arr[0];
         right_max[arr.length-1]=arr[arr.length-1];

        if(arr.length>2){
            for(int i=1;i<arr.length;i++){
                left_max[i]=Math.max(arr[i],left_max[i-1]);
            }
            for(int i=arr.length-2;i>=0;i--){
                right_max[i]=Math.max(arr[i],right_max[i+1]);
            }
            for(int i=0;i<arr.length;i++){
                volume+=(Math.min(left_max[i],right_max[i])-arr[i]);
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        int []arr={4,2,0,6,3,2,5};
        System.out.println(rainwater(arr));
    }

}
