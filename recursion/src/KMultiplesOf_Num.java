import java.util.*;
public class KMultiplesOf_Num {
    public static void multiples(int num,int k){
        if(k==1){
            System.out.println(num);
            return;
        }
        multiples(num,k-1);
        System.out.println(num*k);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        multiples(num,k);
    }
}
