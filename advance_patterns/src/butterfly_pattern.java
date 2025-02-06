import java.util.*;
public class butterfly_pattern {
    public static void pattern(int n){
          for(int i=1;i<=n;i++){
//              part1
              for(int a=1;a<=i;a++){
                  System.out.print("*");
              }
//              space 1
              for(int b=1;b<=n-i;b++){
                  System.out.print(" ");
              }
//              space 2
              for(int c=1;c<=n-i;c++){
                  System.out.print(" ");
              }
//              part2
              for(int d=1;d<=i;d++){
                  System.out.print("*");
              }
              System.out.println();
          }
          for(int i=1;i<=n;i++){
//              part3
              for(int a=i;a<=n;a++){
                  System.out.print("*");
              }
//              space 3
              for(int b=1;b<i;b++){
                  System.out.print(" ");
              }
//              space 4
              for(int c=1;c<i;c++){
                  System.out.print(" ");
              }
//              part 4
              for(int d=n;d>=i;d--){
                  System.out.print("*");
              }

              System.out.println();
          }

    }

//    another approach (stars , space ,stars)
    public static void butterfly(int n){
//        for upturned image
        for(int i=1;i<=n;i++){
//            stars
            for(int a=1;a<=i;a++){
                System.out.print("*");
            }
//            for space
            for(int b=1;b<=2*(n-i);b++){
                System.out.print(" ");
            }
//            stars
            for(int c=1;c<=i;c++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for inverted image
        for(int i=n;i>=1;i--){
//            stars
            for(int a=1;a<=i;a++){
                System.out.print("*");
            }

//            space
            for(int b=1;b<=2*(n-i);b++){
                System.out.print(" ");
            }
            for(int c=1;c<=i;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        pattern(n);
        System.out.println();
        butterfly(n);
    }
}
