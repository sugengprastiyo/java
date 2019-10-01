package faktorial;
public class Faktorial {
    public int nilai;
    public int hasil;
    
    public void faktorialBF(){
        
        int fakto=1;
        for (int i = 1; i<= nilai; i++ ){
            fakto = fakto * i;
        }
        System.out.println("Nilai faktorial Brute Force: " + fakto);
    }
       public void faktorialDC(){
  
        int fakto=1;
        for (int i = 1; i<= nilai; i++ ){
            fakto = fakto * i;
        }
        System.out.println("\"Nilai faktorial Divide Conquer : " + fakto);
    }
    }
