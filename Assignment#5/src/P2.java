public class P2 {
    public static int add(int b){
        int sum = 0;
        if(b<10) {
            return b;
        }
        while(b>0){
            sum += b%10;
            b = b/10;

        }
        return add(sum);
    }

    public static void main(String[] args) {
        int b = 12;
        System.out.println(add(b));
    }
}
