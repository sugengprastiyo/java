package TugasNo3;

import java.util.Scanner;

public class Main {

public static void menu() { System.out.println("========== MENU ==========");

System.out.println("1. BFS ");

System.out.println("2. DFS "); System.out.println("==========================");

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Scanner ac = new Scanner(System.in);

String pilih;

System.out.print("Masukkan banyak vertex : ");

int v = sc.nextInt();

int source, dest, src = 0;
menu();

System.out.print(">> ");

int pil = sc.nextInt();

switch (pil) {

case 1:

GraphBFS g = new GraphBFS(v);

do {

System.out.print("Apakah ingin menambah simpul? (iya/tidak): ");

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

} while ("iya".equalsIgnoreCase(pilih)); System.out.println("Terima Kasih"); System.out.println(""); System.out.print("Masukkan starting point :");

int start = sc.nextInt();

g.BFS(start);

break;

case 2:

GraphDFS gr = new GraphDFS(v);

do {

System.out.print("Apakah ingin menambah simpul? (iya/tidak): ");

pilih = ac.nextLine();

System.out.println("");

if (src < v) {

if ("iya".equalsIgnoreCase(pilih)) {

System.out.print("Masukkan source : ");

source = sc.nextInt();

System.out.print("Masukkan destination : ");

dest = sc.nextInt();

gr.addEdge(source, dest);

if (source != source) {

src++;
	}
	}
	}
	System.out.println("");
	} while ("iya".equalsIgnoreCase(pilih));
	System.out.println("Terima Kasih");
	System.out.println("");
	System.out.print("Masukkan starting point :");	
	int strt = sc.nextInt();
	gr.DFS(strt);
	break;
}	
}	
}	
