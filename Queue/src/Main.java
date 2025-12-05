public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.getFirst();
        q.getLast();
        q.getLength();
        q.printQueue();
    }
}
