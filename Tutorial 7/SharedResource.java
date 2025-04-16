class SharedResource {
    private boolean flag = false;

    synchronized void produce() {
        try {
            while (flag) {
                wait();
            }
            System.out.println("Produced an item");
            flag = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!flag) {
                wait();
            }
            System.out.println("Consumed an item");
            flag = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
                try {
                    Thread.sleep(500); // Simulate time to produce
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                try {
                    Thread.sleep(500); // Simulate time to consume
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
