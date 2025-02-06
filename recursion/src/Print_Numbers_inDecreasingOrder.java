public class Print_Numbers_inDecreasingOrder {
    public static void print(int n){
        if(n<1) return;
        System.out.println(n);
        print(n-1);
    }
    public static void printincreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(10);
        System.out.println(" ");
        printincreasing(10);
    }
}
