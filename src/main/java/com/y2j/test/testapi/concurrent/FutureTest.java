package com.y2j.test.testapi.concurrent;

import org.apache.catalina.Executor;

import java.util.concurrent.*;

/**
 * @Author liuhao
 * @Date 2018/6/21 16:05
 */
public class FutureTest
{
    public static void main(String[] args)
    {
        AddService addService = new AddService(1,2);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(addService);
        try
        {
            System.out.println("before get:=========");
            Integer c = future.get();
            System.out.println("c=" + c);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        } catch (ExecutionException e)
        {
            e.printStackTrace();
        }


    }

    static class AddService implements Callable<Integer>
    {
        private Integer a;
        private Integer b;

        public AddService(Integer a,Integer b)
        {
            this.a = a;
            this.b = b;
        }

        @Override
        public Integer call() throws Exception
        {
            Thread.sleep(2000);
            return a + b;
        }
    }
}
