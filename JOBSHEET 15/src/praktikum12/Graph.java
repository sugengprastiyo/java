package praktikum12;
import java.util.Scanner;
public class Graph {
    int vertex;
    String[] kota;
    LinkedList list[];
    int jenis;
    static Scanner scInt = new Scanner(System.in);
    static Scanner scString = new Scanner(System.in);
    
    public void addVertex(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        kota = new String[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
            System.out.print("Masukkan nama kota ["+i+"] : ");
            kota[i] = scString.nextLine();
        }
    }
    
    public void addEdge(int source, int destination){
        if (source < vertex && destination < vertex) {
            if (graphType(jenis)==true) {
                list[source].addFirst(destination);
            } else {
                list[source].addFirst(destination);
                list[destination].addFirst(source);
            }
        }else{
            System.out.println("Source dan Destinasi melebihi simpul");
        }
    }
    
    public boolean graphType(int jns){
        jenis = jns;
        if (jenis==1) {
            return true;
        }else{
            return false;
        }
    }
    
    public void degree(int source) throws Exception{
        if (graphType(jenis)==false) {
           //degree undirected graph
            System.out.println("degree vertex "+source +" : "+list[source].size()); 
        } else {
            //degree directed graph
                //inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size; j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }

                //outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex "+ source +" : "+totalIn);
            System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
            System.out.println("degree vertex "+ source +" : "+(totalIn+totalOut));
        }
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        //directed graph
        if (graphType(jenis)==true) {
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size; j++) {
                    if (list[i].get(j) == destination && i == source) {
                        list[source].remove(j);
                    }
                }
            }
            
        //undirect graph
        } else {
            for (int i = 0; i < vertex; i++) {
                for (int k = 0; k < list[i].size; k++) {
                    if (list[i].get(k) == source && i == destination) {
                        list[destination].remove(k);
                    }
                }  
            }
        }
    }
    
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0) {
                System.out.print("Kota " + kota[i] + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    for (int k = 0; k < vertex; k++) {
                        if (list[i].get(j)==k) {
                            System.out.print(kota[k]+" ");
                        }
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) throws Exception{
        Graph graph = new Graph();
        int pilihan = 0;
        int pilihanGraph;
        do {
            System.out.println("======================================");
            System.out.println("Pilih menu : ");
            System.out.println("1. Jenis Graph (Directed/Undirected)");
            System.out.println("2. Input jumlah vertex");
            System.out.println("3. addEdge");
            System.out.println("4. removeEdge");
            System.out.println("5. removeAllEdges");
            System.out.println("6. keluar");
            System.out.println("======================================");
            System.out.print(">> ");
            pilihan = scInt.nextInt();
            switch(pilihan){
                case 1:
                    System.out.println("======================================");
                    System.out.println("Pilih jenis Graph : ");
                    System.out.println("1. Directed");
                    System.out.println("2. Undirected");
                    System.out.println("=======================");
                    System.out.print(">> ");
                    pilihanGraph = scInt.nextInt();
                    if (pilihanGraph >= 2 || pilihanGraph <= 1) {
                        if (pilihanGraph == 1) {
                            System.out.println("jenis graph : Directed");
                        }else{
                            System.out.println("jenis graph : Undirected");
                        }
                        graph.graphType(pilihanGraph);
                    }else{
                        System.out.println("Pilihan Salah");
                    }
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.print("Masukkan jumlah vertex : ");
                    int jumvertex = scInt.nextInt();
                    graph.addVertex(jumvertex);
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.print("Masukkan source \t: ");
                    int addSource = scInt.nextInt();
                    System.out.print("Masukkan destination \t: ");
                    int addDestination = scInt.nextInt();
                    System.out.println("");
                    graph.addEdge(addSource, addDestination);
                    graph.printGraph();
                    break;
                case 4:
                    System.out.println("======================================");
                    System.out.print("Masukkan source \t: ");
                    int removeSource = scInt.nextInt();
                    System.out.print("Masukkan destination \t: ");
                    int removeDestination = scInt.nextInt();
                    System.out.println("");
                    graph.removeEdge(removeSource, removeDestination);
                    graph.printGraph();
                    break;
                case 5:
                    System.out.println("======================================");
                    graph.removeAllEdges();
            }
        } while (pilihan!=6);
    }
}