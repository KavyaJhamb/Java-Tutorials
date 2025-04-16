import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Callable task that returns the sum of two numbers
class SumTask implements Callable<Integer> {
    private int num1, num2;

    public SumTask(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call() {
        return num1 + num2; // Compute and return the sum
    }
}

 class CallableExample {
    public static void main(String[] args) {
        // Create a single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            // Submit the callable task to the executor
            Future<Integer> futureResult = executor.submit(new SumTask(10, 20));

            // Wait for the result
            int sum = futureResult.get();
            System.out.println("Sum of 10 and 20 is: " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Always shutdown the executor
            executor.shutdown();
        }
    }
}
