import java.util.*;
public class inverted_half_pyramid {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
//            for spaces
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         pyramid(n);
    }
}
