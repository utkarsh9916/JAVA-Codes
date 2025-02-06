public class LeapYear {
    public static boolean leap(int year){
        if((year%100!=0 && year%4==0) || year%400==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b=leap(1600);
        System.out.println(b);
    }
}
