/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author hunayn
 */
public class MahasiswaMainQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
 
        LinkedListQuiz llQ = new LinkedListQuiz();

        System.out.print("Input jumlah mahasiswa : ");
        int jumlah = sc.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama : ");
            String nama = sc1.nextLine();
            System.out.print("Nim : ");
            int nim = sc.nextInt();
            System.out.print("Nilai : ");
            int nilai = sc.nextInt();
            llQ.add(nama, nim, nilai);
        }
        llQ.sort();
        llQ.tampil();
    }
}
