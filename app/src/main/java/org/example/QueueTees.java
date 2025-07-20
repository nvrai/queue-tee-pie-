package org.example;

public class QueueTees {
    private static final int MAX_SIZE = 10;
    private Cutie[] queue;
    private int front;
    private int rear;
    private int count;

    public QueueTees() {
        queue = new Cutie[MAX_SIZE];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void enqueue(Cutie cutie) {
        if (count == MAX_SIZE) {
            System.out.println("Queue is full. Cannot enqueue new Cutie.");
            return;
        }
        queue[rear] = cutie;
        rear = (rear + 1) % MAX_SIZE;
        count++;
    }

    public Cutie dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        }
        Cutie removed = queue[front];
        queue[front] = null;
        front = (front + 1) % MAX_SIZE;
        count--;
        return removed;
    }

    public int size() {
        return count;
    }
}

