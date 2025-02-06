import java.util.*;
public class diamond_pattern {
        public static void diamond(int n){
//            upturned
            for(int i=1;i<=n;i++){
//                spaces
                for(int a= 1;a<=n-i;a++){
                    System.out.print(" ");
                }
//                stars
                for(int b=1;b<=2*i-1;b++){
                    System.out.print("*");
                }
                System.out.println();
            }
//            inverted
            for(int i=n;i>=1;i--){
//                spaces
                for(int a=1;a<=n-i;a++){
                    System.out.print(" ");
                }
                for(int b=1;b<=2*i-1;b++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        diamond(n);
    }
}
