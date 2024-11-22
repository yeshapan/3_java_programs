//Program to create thread by implementing Runnable Interface

class NewThread implements Runnable {
    Thread t;

    NewThread() { // Create a new second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start(); // Start the thread
    }

    // Entry point for the second thread
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500); // Sleep for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Child Thread exiting.");
    }
}

// Main class to run the thread
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // Create and start the new thread

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000); // Sleep for 1000 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exiting.");
    }
}

/* Output:
Child Thread: Thread[Demo Thread,5,main]
Child Thread: 0
Main Thread: 0
Child Thread: 1
Child Thread: 2
Main Thread: 1
Child Thread: 3
Child Thread: 4
Child Thread exiting.
Main Thread: 2
Main Thread: 3
Main Thread: 4
Main Thread exiting.
*/
