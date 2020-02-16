import java.lang.reflect.Array;
import java.util.Arrays;
 class P3 {
    public static int[] add(int[] c){
        int i;
        int length = c.length;
        int[] y =new int[length];
        int j = c.length -1;
        int x = 0;
        for(i = 0; i< c.length; i++ ){
            if(c[i] != 0){
               y[x] = c[i];
               x++;
            }
            else if (c[i] == 0){
                y[j] = 0;
                j--;
            }
        }
        return y;

    }

     public static void main(String[] args) {
         int[] c = new int[]{0,0,1,0,5,3,0,0,4,5,6};
         System.out.println(Arrays.toString(add(c)));
     }
}
