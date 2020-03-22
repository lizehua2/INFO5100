public class Separete implements Runnable {
    int leftBound;
    int rightBound;
    int[] arr;


    public Separete (int leftBound, int rightBound,int[] arr){
        this.leftBound = leftBound;
        this.rightBound = rightBound;
        this.arr = arr;
    }

    public long sum(){
        long res = 0;
        for (int i = leftBound; i < rightBound; i++){
            res += arr[i];
        }
    return res;
}


    @Override
    public void run() {

    }
}
