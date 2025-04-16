import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumNaturalNumbers implements Callable<Long> {
private int n;
public SumNaturalNumbers(int n) {
this.n = n;
}
@Override
public Long call() {
return (long) n * (n + 1) / 2;
}
}
class SumCallableExample {
public static void main(String[] args) {
int N = 100; 
ExecutorService executor = Executors.newSingleThreadExecutor();
Future<Long> futureResult = executor.submit(new SumNaturalNumbers(N));
try {
long sum = futureResult.get(); 
System.out.println("Sum of first " + N + " natural numbers is: " + sum);
} catch (Exception e) {
e.printStackTrace();
}
executor.shutdown();
}
}
