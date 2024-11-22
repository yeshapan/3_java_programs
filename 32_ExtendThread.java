//Program to create a thread by extending Thread class

// Child thread by extending Thread
class NewThread extends Thread {
    NewThread() {
        // Create a new, second thread
        super("Demo Thread"); // Name the thread "Demo Thread"
        System.out.println("Child thread: " + this); // Print thread details
        start(); // Start the thread
    }

    // Entry point for the second thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500); // Pause for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

// Main class to run the threads
class ExtendThread {
    public static void main(String[] args) {
        // Create and start a new child thread
        new NewThread();

        // Main thread logic
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000); // Pause for 1000 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
