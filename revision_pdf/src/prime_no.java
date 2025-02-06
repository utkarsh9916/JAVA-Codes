public class prime_no {
    public static boolean prime(int num){
        if(num<=1) {
            return false;
        }
            else if(num==2){
                return true;
            }
            else{
                for(int i=2;i<num;i++){
                    if(num%i==0){
                        return false;
                    }
                }
                return true;
            }
    }

    public static void main(String[] args) {
        System.out.println(prime(56));
    }


}
