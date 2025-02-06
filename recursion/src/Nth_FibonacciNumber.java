public class Nth_FibonacciNumber {
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int f1=fibonacci(n-1);
        int f2=fibonacci(n-2);
        return f1+f2;
    }

    public static void main(String[] args) {
        int ans=fibonacci(25);
        System.out.println(ans);

    }
}
