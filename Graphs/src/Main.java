public class Main {
    public static void main(String[] args) {
        Graph mygraph = new Graph();
        mygraph.addVertex("A");
        mygraph.addVertex("B");
        mygraph.addVertex("C");
        mygraph.addEdge("A","B");
        mygraph.addEdge("A","C");
        mygraph.addEdge("C","B");
        mygraph.printgraph();
        mygraph.removeEdge("B","C");
        mygraph.printgraph();
        mygraph.removeVertex("A");
        mygraph.printgraph();
    }
}
