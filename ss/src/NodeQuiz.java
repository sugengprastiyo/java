/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hunayn
 */
public class NodeQuiz {
    NodeQuiz next;
    MahasiswaQuiz mhs;
    NodeQuiz(String nama, int nim, int nilai, NodeQuiz next){
        this.mhs = new MahasiswaQuiz(nama, nim, nilai);
        this.next=next;
    }
}
