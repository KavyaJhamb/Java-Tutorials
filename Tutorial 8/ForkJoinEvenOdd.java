import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
class CountTask extends RecursiveTask<int[]> {
private final int[] arr;
private final int start, end;
private static final int THRESHOLD = 1000; 
public CountTask(int[] arr, int start, int end) {
this.arr = arr;
this.start = start;
this.end = end;
}
@Override
protected int[] compute() {
if ((end - start) <= THRESHOLD) {

int evenCount = 0, oddCount = 0;
for (int i = start; i < end; i++) {
if (arr[i] % 2 == 0) evenCount++;
else oddCount++;
}
return new int[]{evenCount, oddCount};
} else {
int mid = start + (end - start) / 2;
CountTask leftTask = new CountTask(arr, start, mid);
CountTask rightTask = new CountTask(arr, mid, end);
leftTask.fork();
int[] rightResult = rightTask.compute();
int[] leftResult = leftTask.join();
return new int[]{leftResult[0] + rightResult[0], leftResult[1] + rightResult[1]};
}
}
}
 class ForkJoinEvenOdd {
public static void main(String[] args) {
int size = 10_000_000; 
int[] arr = new int[size];
Random rand = new Random();
for (int i = 0; i < size; i++) {
arr[i] = rand.nextInt(100);
}
ForkJoinPool pool = new ForkJoinPool();
CountTask task = new CountTask(arr, 0, size);
// Start parallel computation
int[] result = pool.invoke(task);
System.out.println("Even Count: " + result[0]);
System.out.println("Odd Count: " + result[1]);
}
}
