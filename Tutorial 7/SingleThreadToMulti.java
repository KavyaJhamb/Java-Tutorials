class Task1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task 1 - " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task 2 - " + i);
        }
    }
}

public class SingleThreadToMulti {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        
        t1.start();  
        t2.start();  
    }
}

