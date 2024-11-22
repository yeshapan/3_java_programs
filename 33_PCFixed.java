//Program to demonstrate producer-consumer problem (Thread synchronisation and wait() and notify() methods)

// Shared resource class
class Q {
    private int n; // Shared data
    private boolean valueSet = false; // Tracks if value is available

    // Consumer calls this method to get a value
    synchronized int get() {
        while (!valueSet) { // Wait until a value is available
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false; // Value has been consumed
        notify(); // Notify the producer to produce another value
        return n;
    }

    // Producer calls this method to put a value
    synchronized void put(int n) {
        while (valueSet) { // Wait until the value is consumed
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true; // Value has been produced
        System.out.println("Put: " + n);
        notify(); // Notify the consumer to consume the value
    }
}

// Producer class
class Producer implements Runnable {
    private Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start(); // Start the producer thread
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++); // Produce sequential values
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start(); // Start the consumer thread
    }

    public void run() {
        while (true) {
            q.get(); // Consume values
        }
    }
}

// Main class
class PCFixed {
    public static void main(String[] args) {
        Q q = new Q(); // Shared resource
        new Producer(q); // Create producer
        new Consumer(q); // Create consumer
        System.out.println("Press Control-C to stop.");
    }
}
