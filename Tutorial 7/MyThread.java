class MyThread extends Thread {
    public void run() {
    try {
    System.out.println("Thread is going to sleep for 5 seconds...");
    Thread.sleep(5000);
    System.out.println("Thread woke up normally.");
    } catch (InterruptedException e) {
    System.out.println("Thread was interrupted while sleeping!");
    }
    System.out.println("Thread exiting...");
    }
    }
    class InterruptExample {
    public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();
    try {
    Thread.sleep(2000); 
    t1.interrupt(); 
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    }