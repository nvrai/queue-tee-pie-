package org.example;

public class App {
    public String getGreeting() {
        return "Hello! Welcome to my Queue Tee Pie Code!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        QueueTees queue = new QueueTees();

        // Size: 0
        System.out.println("Initial size: " + queue.size());

        // Enqueue cuties
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        // Size: 3
        System.out.println("Size after enqueueing: " + queue.size());

        // Print descriptions
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());

        queue.dequeue();
    }
}
