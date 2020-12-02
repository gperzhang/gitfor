package com.mall.order.test;

import java.util.concurrent.*;

/**
 * @author acai
 * @date 2020/11/26
 **/
public class TestFutrure {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        long time1 = System.currentTimeMillis();
//        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()-> method1());
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> method2());
//        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> method3());
//
//        CompletableFuture.allOf(future1, future2, future3).join();
//
//        System.out.println("future1:"+future1.get());
//        System.out.println("future2:"+future2.get());
//        System.out.println("future3:"+future3.get());
//        System.out.println("耗时:"+(System.currentTimeMillis()-time1));




        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,5,1, TimeUnit.SECONDS,new SynchronousQueue<>(),new ThreadPoolExecutor.AbortPolicy());

        try {
            Future<String> submit1 = executor.submit(TestFutrure::method1);
        } catch (Exception e) {
            System.out.println("method1 error");
            e.printStackTrace();
        }
        try {
            Future<String> submit2 = executor.submit(TestFutrure::method2);
        } catch (Exception e) {
            System.out.println("method2 error");
            e.printStackTrace();
        }
        try {
            Future<String> submit3 = executor.submit(TestFutrure::method3);
        } catch (Exception e) {
            System.out.println("method3 error");
            e.printStackTrace();
        }
        try {
            Future<String> submit4 = executor.submit(TestFutrure::method4);
        } catch (Exception e) {
            System.out.println("method4 error");
            e.printStackTrace();
        }
        try {
            Future<String> submit5 = executor.submit(TestFutrure::method5);
        } catch (Exception e) {
            System.out.println("method5 error");
            e.printStackTrace();
        }
        try {
            Future<String> submit6 = executor.submit(TestFutrure::method6);
        } catch (Exception e) {
            System.out.println("method63 error");
            e.printStackTrace();
        }


    }

    public static String  method1(){
        System.out.println("method1");
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "method1";
    }
    public static String method2(){
        System.out.println("method2");
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "method2";
    }
    public static String method3(){
        System.out.println("method3");
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "method3";
    }
    public static String method4(){
        System.out.println("method4");
        try {
            Thread.sleep(40000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "method4";
    }
    public static String method5(){
        System.out.println("method5");
        try {
            Thread.sleep(50000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "method5";
    }
    public static String method6(){
        System.out.println("method6");
        try {
            Thread.sleep(60000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "method6";
    }
}
