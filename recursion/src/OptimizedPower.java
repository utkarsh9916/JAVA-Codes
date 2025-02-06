public class OptimizedPower {
    public static long optimizedPower(long a,long n){
        if(n==0){
            return 1;
        }
        long halfpower=optimizedPower(a,n/2);

        long halfpowerSq=halfpower*halfpower;
        if(n%2!=0){
            halfpowerSq=a*halfpowerSq;
        }
        return halfpowerSq;
    }

    public static void main(String[] args) {
        long ans=optimizedPower(2,62);
        System.out.println(ans);
    }
}
