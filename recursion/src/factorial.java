public class factorial {
    public static int  factorial(int n){
        if(n<=0) return 1;
       int b= factorial(n-1);
        int a=n*b;
        return a;

    }

    public static void main(String[] args) {
        int n=factorial(8);
        System.out.println(n);
    }
}
