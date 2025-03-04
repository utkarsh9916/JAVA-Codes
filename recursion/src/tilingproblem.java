public class tilingproblem {
    // given a 2*n plane where we have to put the tiles of 2*1 find the number of ways to put the tiles
    public static int tiling(int n){
        if(n==0|| n==1){
            return 1;
        }
        int vertical=tiling(n-1);
        int horizontal=tiling(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int ans=tiling(4);
        System.out.println(ans);
    }
}
