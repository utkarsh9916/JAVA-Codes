import java.util.*;
public class lexiographicalOrder {
//    given an array names of fruits sort in lexiographical order
    public static String [] selection(String []arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
//                String s1=arr[min];
//                String s2=arr[j];
                if(arr[j].compareTo(arr[min])<0){
                    min=j;

                }
            }
            String temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        String str[]={"papaya","lime","watermelon","apple","mango","kiwi"};
        String ans[]=selection(str);
        System.out.println(Arrays.toString(ans));
    }
}
