package org.codesolutions.advanced.queue;

public class ArrayQueueRunner {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.front());   // Output: 1
        System.out.println(queue.rear());    // Output: 3
        queue.dequeue();
        System.out.println(queue.front());   // Output: 2

        System.out.println(queue.enqueue(40));   // Output: true
        System.out.println(queue.enqueue(41));   // Output: false  (queue is full)

    }
}
