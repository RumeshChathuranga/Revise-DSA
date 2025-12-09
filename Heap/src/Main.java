public class Main {
    public static void main(String[] args) {
        Heap myheap = new Heap();
        myheap.insert(99);
        myheap.insert(72);
        myheap.insert(21);
        myheap.insert(58);
        System.out.println(myheap.getHeap());
        myheap.insert(100);
        System.out.println(myheap.getHeap());
        myheap.insert(75);
        System.out.println(myheap.getHeap());
    }
}
