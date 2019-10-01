package Praktikum;
import  java.util.Scanner;
public class DFSGraph {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Scanner ac = new Scanner(System.in);
String pilih;
System.out.print("Masukkan banyak vertex : ");
int v = sc.nextInt();
int source, dest, src = 0;
Graph g = new Graph(v);
do {
System.out.print("Apakah ingin menambah simpul?(iya/tidak): ");
pilih = ac.nextLine();
System.out.println("");
    if (src < v) {
        if ("iya".equalsIgnoreCase(pilih)) {
        System.out.print("Masukkan source : ");
        source = sc.nextInt();
        System.out.print("Masukkan destination : ");
        dest = sc.nextInt();
g.addEdge(source, dest);
if (source != source) {
src++;
}
    }
        }
System.out.println("");
} while ("iya".equalsIgnoreCase(pilih));
System.out.print("Masukkan starting point DFS : ");
int dfs = sc.nextInt();
System.out.println("Following is Breadth First Traversal"+"(starting from vertex " + dfs + " )"); 
g.DFS(dfs);
    System.out.println(" ");

}

}

