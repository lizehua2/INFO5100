import java.util.Arrays;

public class P5 {
    public static int[][] rotate(int a[][]){
        int i;
        int j = 0;
        int c[][] = new int[a.length][a.length];
        for(i =0; i<a.length; i++){
            for(j=0;j<a.length;j++){
                c[i][j] = a[a.length-1-j][i];
            }

        }
        return c;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(rotate(a)));
    }
}
