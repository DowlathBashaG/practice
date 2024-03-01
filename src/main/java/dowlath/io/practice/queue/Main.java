package src.java.io.dowlath.dsapractice.queue;

public class Main{
    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enQueue(2);
        queue.deQueue();
        queue.printQueue();
    }
}
