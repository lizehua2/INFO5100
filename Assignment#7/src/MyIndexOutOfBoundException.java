import java.util.Random;
public class MyIndexOutOfBoundException extends RuntimeException {
    int lowerBound;
    int upperBound;
    int index;
    public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index ){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }
    public String toString (){
        return "Error Message: Index: " +index+", but Lowe bound: "+lowerBound+ ", Upper bound: "+upperBound;

    }

    public static void main(String[] args) {
        final int range = 10;
        int[] nums = new int[range];
        Random random = new Random();
        while (true){
            int i = random.nextInt(range+range);
            System.out.println("Given an array with the size of " + range + " and the random number is "+i);
            try {
                if (i >= range)
                    throw new MyIndexOutOfBoundException(i, 0, range-1);
                else
                    nums[i] = random.nextInt(range);
            }
            catch (Exception e){
                System.out.println(e);
                return;
            }

        }
    }
}
