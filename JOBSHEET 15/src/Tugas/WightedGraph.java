package Tugas;
import java.util.LinkedList;
public class WightedGraph {
    static class Graph {
        int vertices;
        LinkedList<Edge>[] adjacencylist;
        
        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the verticesfor 
            for(int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
            }
        }
        public void addEgde(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].addFirst(edge); 
        //for directed graph
        }
        
        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("Vertex " + i + " terhubung dengan "+ list.get(j).destination + " dengan bobot : " + list.get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEgde(5, 2, 3);
        graph.addEgde(3, 1, 3);
        graph.addEgde(4, 1, 1);
        graph.addEgde(2, 1, 6);
        graph.addEgde(1, 5, 8);
        graph.addEgde(2, 2, 4);
        graph.addEgde(1, 1, 5);
        graph.addEgde(2, 3, 4);
        graph.addEgde(1, 1, 4);
        graph.printGraph();
    }
}
