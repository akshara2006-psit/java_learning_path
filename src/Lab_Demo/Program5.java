package Lab_Demo;

public class Program5{
 public static void main(String[] args) {
	 System.out.println("Akshara Gupta \n CS 2A(ELITE) \n 2401640100125");
    
     try {
         int a = 10;
         int b = 0; 
         int result = a / b;
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Caught an ArithmeticException: " + e.getMessage());
     } finally {
         System.out.println("Finally block executed: Cleaning up resources...");
     }
     Runnable task1 = () -> {
         for (int i = 0; i < 5; i++) {
             System.out.println("Thread 1 is running...");
             try {
                 Thread.sleep(500); 
             } catch (InterruptedException e) {
                 System.out.println("Thread 1 interrupted.");
             }
         }
     };

     Runnable task2 = () -> {
         for (int i = 0; i < 5; i++) {
             System.out.println("Thread 2 is running...");
             try {
                 Thread.sleep(500); 
             } catch (InterruptedException e) {
                 System.out.println("Thread 2 interrupted.");
             }
         }
     };

     Thread t1 = new Thread(task1);
     Thread t2 = new Thread(task2);
     t1.start();
     t2.start();
     try {
         t1.join();
         t2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }
     System.out.println("Main thread finished execution.");
 }
}
