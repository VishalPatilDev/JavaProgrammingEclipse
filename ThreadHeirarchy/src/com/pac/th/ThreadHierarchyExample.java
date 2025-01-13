package com.pac.th;

public class ThreadHierarchyExample {
    public static void main(String[] args) {
        // Main thread
        System.out.println("Main thread: " + Thread.currentThread().getName());

        // Create a thread group
        ThreadGroup groupA = new ThreadGroup("Group A");

        // Add threads to the group
        Thread t1 = new Thread(groupA, () -> {
            System.out.println("Thread 1 in " + Thread.currentThread().getThreadGroup().getName());
        });

        Thread t2 = new Thread(groupA, () -> {
            System.out.println("Thread 2 in " + Thread.currentThread().getThreadGroup().getName());
        });
        
        ThreadGroup groupB = new ThreadGroup("Group B");
        Thread t3 = new Thread(groupB,()->{
        	System.out.println("Thread 3 in " + Thread.currentThread().getThreadGroup().getName());
        });
        
        Thread t4 = new Thread(groupB,()->{
        	System.out.println("Thread 4 in " + Thread.currentThread().getThreadGroup().getName());
        });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Daemon thread
        Thread daemonThread = new Thread(() -> {
            System.out.println("Daemon thread running...");
        });
//        System.out.println(daemonThread.isDaemon());
        daemonThread.setDaemon(true);
        System.out.println(daemonThread.isDaemon());
        daemonThread.start();
       
    }
}

