import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
class MaxFinderTask extends RecursiveTask<Integer> {
private final int[] arr;
private final int start, end;
private static final int THRESHOLD = 1000; 
public MaxFinderTask(int[] arr, int start, int end) {
this.arr = arr;
this.start = start;
this.end = end;
}
@Override
protected Integer compute() {
if ((end - start) <= THRESHOLD) {
int max = arr[start];
for (int i = start + 1; i < end; i++) {
max = Math.max(max, arr[i]);
}
return max;
} else {
int mid = start + (end - start) / 2;
MaxFinderTask leftTask = new MaxFinderTask(arr, start, mid);
MaxFinderTask rightTask = new MaxFinderTask(arr, mid, end);
leftTask.fork();
int rightMax = rightTask.compute();
int leftMax = leftTask.join();
return Math.max(leftMax, rightMax);
}
}
}
public class ForkJoinMaxFinder {
public static void main(String[] args) {
int size = 10_000_000; 
int[] arr = new int[size];
Random rand = new Random();
for (int i = 0; i < size; i++) {
arr[i] = rand.nextInt(100000); 
}
ForkJoinPool pool = new ForkJoinPool();
MaxFinderTask task = new MaxFinderTask(arr, 0, size);
// Start parallel max finding
int maxValue = pool.invoke(task);
System.out.println("Maximum Value: " + maxValue);
}
}