public class intro_to_nested_loop {
    public static void main(String[] args) {
//     1.   star pattern
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
//        2.inverted star pattern
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
//        3. number half pyramid pattern
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

//
    }
}
