public class SumOf_n_NaturalNumbers {
    public static int sum(int n){
        if (n<1) return 0;
        return n+sum(n-1);
    }
    public static int sum2(int n){
        if (n>5) return 0;
        return n+sum2(n+1);
    }

    public static void main(String[] args) {
        int n=10;
        int ans=sum(5);
        System.out.println(ans);
        int ans2=sum2(1);
        System.out.println(ans2);
    }
}
