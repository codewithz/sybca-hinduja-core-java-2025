class RunnableRunner{

    public static void main(String[] args) {
        
        Runnable work=new MyRunnable();
        Thread worker1=new Thread(work);
        Thread worker2=new Thread(work);
        Thread worker3=new Thread(work);

        worker1.setName("Worker 1");
        worker2.setName("Worker 2");
        worker3.setName("Worker 3");

        worker1.setPriority(Thread.MIN_PRIORITY);
        worker2.setPriority(Thread.NORM_PRIORITY);
        worker3.setPriority(Thread.MAX_PRIORITY);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}