package java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * CallableDemo.java
 * <p>
 * Created by lijiankun on 2019-04-06.
 */
public class CallableDemo implements Callable<Integer> {

    public static void main(String[] args) {
        try {
            Callable<Integer> callable = new CallableDemo();
            FutureTask<Integer> futureTask = new FutureTask<>(callable);
            Thread thread = new Thread(futureTask);
            thread.start();

            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() {
        int res = 0;
        for (int i = 0; i < 100; i++) {
            res += i;
        }
        return res;
    }
}
