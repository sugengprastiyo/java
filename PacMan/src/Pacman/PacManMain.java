package Pacman;
import java.util.Scanner;
public class PacManMain {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        PacMan p1 = new PacMan(); 
        System.out.println("Masukkan Panjang = ");
        p1.width=sc.nextInt();
        System.out.println("Masukkan Lebar = ");
        p1.height=sc.nextInt();
        System.out.println("Masukkan posisi awal x : ");
        p1.x=sc.nextInt();
        System.out.println("Masukkan posisi awal y : ");
        p1.y=sc.nextInt();
        if (p1.x<=p1.width && p1.y<=p1.height){
            System.out.println("Masukkan gerakan U/D/R/L : ");
        char pilihan = sc.next().charAt(0);
        if (pilihan == 'U' || pilihan == 'u') {
            p1.moveUp();
            if ( p1.y>=0 && p1.x>=0 && p1.x<=p1.width &&  p1.y<=p1.height ){
                p1.printPosisiton();
            }else{
                System.out.println("Eror melebihi batas");
            }
        }else if(pilihan == 'D' || pilihan == 'd'){
            p1.moveDown();
            if ( p1.y>=0 && p1.x>=0 && p1.x<=p1.width &&  p1.y<=p1.height ){
                p1.printPosisiton();
            }else{
                System.out.println("Eror melebihi batas");
            }
            
        }else if (pilihan == 'R' || pilihan == 'r'){
            p1.moveRight();
            if ( p1.y>=0 && p1.x>=0 && p1.x<=p1.width &&  p1.y<=p1.height ){
                p1.printPosisiton();
            }else{
                System.out.println("Eror melebihi batas");
            }
        }else if (pilihan == 'L'  || pilihan == 'l'){
            p1.moveLeft();
            if ( p1.y>=0 && p1.x>=0 && p1.x<=p1.width &&  p1.y<=p1.height ){
                p1.printPosisiton();
            }else{
                System.out.println("Eror melebihi batas");
            }
        }else {
            System.out.println("Erorrr !!!!!");
        }
        }
        else {
            System.out.println("Eror Melebihi Batas ");
        }
        
        
        
    }
    
}
