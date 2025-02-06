import java.util.*;
public class AlternateSum {

    public static int sum(int n){
        if(n==0) return 0;
        if(n%2!=0){
           return n+ sum(n-1);
        }
        return -n+sum(n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.println(ans);
    }
}
