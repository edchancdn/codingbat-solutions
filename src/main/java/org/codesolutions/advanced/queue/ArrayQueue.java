package org.codesolutions.advanced.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private int front;
    private int rear;
    private int size;
    private int capacity;
    private int[] queue;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean enqueue(int item) {
        if (isFull()) {
            //throw new IllegalStateException("Queue is full");
            return false;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.queue[this.rear] = item;
        this.size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int item = this.queue[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return item;
    }

    public int front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return this.queue[this.front];
    }

    public int rear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return this.queue[this.rear];
    }
}

