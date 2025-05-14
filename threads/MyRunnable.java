public class MyRunnable implements Runnable {
    public void run() {
        for(int index=1;index<101;index++){
        System.out.println("Thread running: " + Thread.currentThread().getName()+" --" +index);
        }
    }
}
 
