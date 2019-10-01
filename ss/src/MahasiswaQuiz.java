/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hunayn
 */
public class MahasiswaQuiz {
    String nama;
    int nilai,nim;

    MahasiswaQuiz(String nm, int ni, int n){
        nama=nm;
        nim=ni;
        nilai=n;
    }

    void tampil(){
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : "+nama);
        System.out.println("Nim : "+nim);
        System.out.println("Nilai : "+nilai);
    }
}
