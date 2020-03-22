import java.util.Random;
public class SumValueInArray {


    public static void generateRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(50);
        }

    }
    public static long sum(int[] arr) throws InterruptedException {
        Separete s1 = new Separete(0,arr.length/4,arr);
        Separete s2 = new Separete(arr.length/4+1,arr.length/2,arr);
        Separete s3 = new Separete(arr.length/2+1,arr.length/(4/3),arr );
        Separete s4 = new Separete(arr.length/(4/3)+1,arr.length,arr);
        Thread Thread1 = new Thread(s1);
        Thread Thread2 = new Thread(s2);
        Thread Thread3 = new Thread(s3);
        Thread Thread4 = new Thread(s4);
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();

        Thread1.join();
        Thread2.join();
        Thread3.join();
        Thread4.join();

        long new1 = s1.sum();
        long new2 = s2.sum();
        long new3 = s3.sum();
        long new4 = s4.sum();

        return  new1+new2+new3+new4;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[400000];
        generateRandomArray(arr);
        //System.out.println(arr);
        long sum = sum(arr);
        System.out.println("Sum: " +sum);

    }

}
