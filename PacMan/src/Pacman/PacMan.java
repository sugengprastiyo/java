package Pacman;
public class PacMan {
    public int x, y, width, height;
    
    public void moveLeft()
    {
         x=x-1;
    }
    public void  moveRight()
    {
        x= x+1;
    }
    public void moveUp()
    {
        y=y+1;
    }
    public void  moveDown()
    {
        y=y-1;
    }
    public void printPosisiton()
    {
        System.out.println("Posisi sekarang adalah "+x+","+y);
    }
}
