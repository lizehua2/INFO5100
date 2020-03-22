import javax.print.attribute.standard.PresentationDirection;

public class ReverseHello implements Runnable {

    static int count = 0;
    Thread thread;
    int total;

    public ReverseHello(Thread thread, int total) {
        this.thread = thread;
        this.total = total;
    }

    public void createThread(Thread thread, int total) {
        if(count <= total){
            count ++;
            Thread subThread = new Thread();
            createThread(subThread,total);
            System.out.println("Hello from " + thread.getId());
        }

    }



    @Override
    public void run() {

    }


}
class Main{
        public static void main(String[] args) {
            Thread thread0 = new Thread();
            ReverseHello reverseHello = new ReverseHello(thread0,50);
            reverseHello.createThread(thread0,50);

    }

}